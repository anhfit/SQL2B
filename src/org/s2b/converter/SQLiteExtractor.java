package org.s2b.converter;

import java.util.ArrayList;
import org.s2b.core.eventb.*;
import org.s2b.analyzer.sqlite.*;
import org.s2b.analyzer.sqlite.SQLiteParser.*;

import static org.s2b.core.eventb.MathNotation.*;
import static org.s2b.core.eventb.FormulaFactory.*;

public class SQLiteExtractor extends SQLiteBaseListener {
	protected Project project;
	protected Machine machine;
	protected Context context;
	protected Event event;

	// protected Stack<String> mode;
	protected String[] triggerType = { "insert", "update", "delete" };
	protected ArrayList<String> tablesName;
	protected ArrayList<String> columnDef;

	public SQLiteExtractor() {
	}

	public Project getProject() {
		return project;
	}

	protected void init() {
		this.project = new Project("Demo");
		this.machine = new Machine(project, "DEMO_MACHINE");
		this.context = new Context(project, "DEMO_CONTEXT");

		project.addMachine(machine);
		project.addContext(context);

		tablesName = new ArrayList<String>();
		columnDef = new ArrayList<String>();
	}

	@Override
	public void enterParsing_point(Parsing_pointContext ctx) {
		init();
		// mode.push(ctx.getClass().getName());

		context.addCarrierSet(new CarrierSet(null, "TRIGGER_TYPES"));
		context.addCarrierSet(new CarrierSet(null, "TABLE_NAMES"));

		machine.addSeeContext(context);
		machine.addVariable(new Variable(null, "ttype"));
		machine.addVariable(new Variable(null, "table"));

		machine.addInvariant(new Invariant(null, "ttype", elementOfSet("ttype",
				"TRIGGER_TYPES")));
		machine.addInvariant(new Invariant(null, "table", elementOfSet("table",
				"TABLE_NAMES")));
	}

	@Override
	public void exitParsing_point(Parsing_pointContext ctx) {
		for (String t : triggerType) {
			context.addConstant(new Constant(null, t));
		}
		context.addAxiom(new Axiom(null, "trigger_types", partition(
				"TRIGGER_TYPES", triggerType)));

		for (String n : tablesName) {
			context.addConstant(new Constant(null, n));
		}
		context.addAxiom(new Axiom(null, "table_names", partition(
				"TABLE_NAMES", tablesName)));

		// if (!mode.lastElement().equals(
		// Start_parsing_pointContext.class.getName())) {
		// System.out.println("Mode Error at Parsing_point");
		// }
		// mode.pop();
	}

	@Override
	public void enterCreate_table_stmt(Create_table_stmtContext ctx) {
	}

	@Override
	public void exitCreate_table_stmt(Create_table_stmtContext ctx) {
		String table = ctx.table_name().getText();
		tablesName.add(table);

		Constant cst = new Constant(null, "TABLE_" + table.toUpperCase());
		context.addConstant(cst);

		Variable varRec = new Variable(null, table + "_rec");
		machine.addVariable(varRec);

		machine.addInvariant(new Invariant(null, varRec.getIdentifier(),
				elementOfPowerSet(varRec.getIdentifier(), cst.getIdentifier())));

		Variable varPk = new Variable(null, "pk_" + table);
		machine.addVariable(varPk);

		machine.addInvariant(new Invariant(null, varPk.getIdentifier(),
				primaryKeyInvariant(varPk.getIdentifier(),
						varRec.getIdentifier())));

		context.addAxiom(new Axiom(null, table, tableDef(cst.getIdentifier(),
				columnDef)));
		columnDef.clear();
	}

	@Override
	public void enterColumn_def(Column_defContext ctx) {
		// String type = ctx.type_name().name(0).getText();
		// if (type.equals("INTEGER")) {
		columnDef.add(Character.toString(SET_OF_NATURAL_NUMBERS));
		// } else {
		// columnDef.add("?");
		// }
	}

	@Override
	public void enterCreate_trigger_stmt(Create_trigger_stmtContext ctx) {
		event = new Event(null);

		event.setName(ctx.trigger_name().getText());

		if (ctx.DELETE() != null) {
			event.addGuards(new Guard(null, "ttype", "ttype = delete"));
		} else if (ctx.INSERT() != null) {
			event.addGuards(new Guard(null, "ttype", "ttype = insert"));
		} else if (ctx.UPDATE() != null) {
			event.addGuards(new Guard(null, "ttype", "ttype = update"));
		}

		String table = ctx.table_name().getText();
		event.addGuards(new Guard(null, "table", "table = " + table));

		Parameter prm = new Parameter(null, table + "_id");
		event.addParameter(prm);
		event.addGuards(new Guard(null, prm.getIdentifier(), elementOfDom(
				prm.getIdentifier(), table + "_rec")));
	}

	@Override
	public void enterDelete_stmt(Delete_stmtContext ctx) {
		if (event == null)
			return;
		event.addActions(new Action(null, "ttype", becomesEqual("ttype",
				"delete")));
		event.addActions(new Action(null, "table", becomesEqual("table", ctx
				.qualified_table_name().table_name().getText())));
	}

	@Override
	public void enterInsert_stmt(Insert_stmtContext ctx) {
		if (event == null)
			return;
		event.addActions(new Action(null, "ttype", becomesEqual("ttype",
				"insert")));
		event.addActions(new Action(null, "table", becomesEqual("table", ctx
				.table_name().getText())));
	}

	@Override
	public void enterUpdate_stmt(Update_stmtContext ctx) {
		if (event == null)
			return;
		event.addActions(new Action(null, "ttype", becomesEqual("ttype",
				"update")));
		event.addActions(new Action(null, "table", becomesEqual("table", ctx
				.qualified_table_name().table_name().getText())));

		String table = ctx.qualified_table_name().table_name().getText();
		String id = event.getParameter(0).getIdentifier();

		StringBuilder expr = new StringBuilder();
		expr.append("pk_" + table + "(");
		expr.append(id);
		expr.append(") ");
		expr.append(ctx.expr(0).binary_operator().getText());
		expr.append(" ");
		expr.append(ctx.expr(0).literal_value());

		event.addActions(new Action(null, "change_data", updateTrigger(table,
				id, expr.toString())));
	}

	@Override
	public void exitCreate_trigger_stmt(Create_trigger_stmtContext ctx) {
		machine.addEvent(event);
		event = null;
	}
}
