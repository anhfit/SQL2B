package org.s2b.core.eventb;

import org.stringtemplate.v4.*;

import static org.s2b.core.eventb.MathNotation.*;

public class FormulaFactory {
	protected static final STGroup factory = new STGroupFile(
			"./res/templates/formula.stg");

	protected static final ST partition = factory.getInstanceOf("partitionDef");
	protected static final ST becomesEqual = factory
			.getInstanceOf("becomesEqual");
	protected static final ST becomesElementOf = factory
			.getInstanceOf("becomesElementOf");
	protected static final ST becomesSuchThat = factory
			.getInstanceOf("becomesSuchThat");

	protected static final ST updateTrigger = factory
			.getInstanceOf("updateTrigger");
	protected static final ST insertTrigger = factory
			.getInstanceOf("insertTrigger");
	protected static final ST deleteTrigger = factory
			.getInstanceOf("deleteTrigger");

	protected static final ST elementOfPowerSet = factory
			.getInstanceOf("elementOfPowerSet");
	protected static final ST elementOfSet = factory
			.getInstanceOf("elementOfSet");
	protected static final ST elementOfDom = factory
			.getInstanceOf("elementOfDom");
	protected static final ST elementOfRan = factory
			.getInstanceOf("elementOfRan");
	protected static final ST tableDef = factory.getInstanceOf("tableDef");
	protected static final ST pkInvariant = factory
			.getInstanceOf("pkInvariant");

	static {
		becomesEqual.add("MathNotation", DEFAULT_INSTANCE);
		becomesElementOf.add("MathNotation", DEFAULT_INSTANCE);
		becomesSuchThat.add("MathNotation", DEFAULT_INSTANCE);

		updateTrigger.add("MathNotation", DEFAULT_INSTANCE);
		insertTrigger.add("MathNotation", DEFAULT_INSTANCE);
		deleteTrigger.add("MathNotation", DEFAULT_INSTANCE);

		elementOfPowerSet.add("MathNotation", DEFAULT_INSTANCE);
		elementOfSet.add("MathNotation", DEFAULT_INSTANCE);
		elementOfDom.add("MathNotation", DEFAULT_INSTANCE);
		elementOfRan.add("MathNotation", DEFAULT_INSTANCE);
		tableDef.add("MathNotation", DEFAULT_INSTANCE);
		pkInvariant.add("MathNotation", DEFAULT_INSTANCE);
	}

	public static String becomesEqual(String lhs, String rhs) {
		becomesEqual.remove("lhs");
		becomesEqual.remove("rhs");

		becomesEqual.add("lhs", lhs);
		becomesEqual.add("rhs", rhs);
		return becomesEqual.render();
	}

	public static String becomesElementOf(String lhs, String rhs) {
		becomesElementOf.remove("lhs");
		becomesElementOf.remove("rhs");

		becomesElementOf.add("lhs", lhs);
		becomesElementOf.add("rhs", rhs);
		return becomesElementOf.render();
	}

	public static String becomesSuchThat(String lhs, String rhs) {
		becomesSuchThat.remove("lhs");
		becomesSuchThat.remove("rhs");

		becomesSuchThat.add("lhs", lhs);
		becomesSuchThat.add("rhs", rhs);
		return becomesSuchThat.render();
	}

	public static String partition(String set, Object elements) {
		partition.remove("set");
		partition.remove("elements");

		partition.add("set", set);
		partition.add("elements", elements);
		return partition.render();
	}

	public static String elementOfPowerSet(String element, String set) {
		elementOfPowerSet.remove("element");
		elementOfPowerSet.remove("set");

		elementOfPowerSet.add("element", element);
		elementOfPowerSet.add("set", set);

		return elementOfPowerSet.render();
	}

	public static String updateTrigger(String table, String id, String change) {
		updateTrigger.remove("table");
		updateTrigger.remove("id");
		updateTrigger.remove("change");

		updateTrigger.add("table", table);
		updateTrigger.add("id", id);
		updateTrigger.add("change", change);

		return updateTrigger.render();
	}

	public static String elementOfSet(String element, String set) {
		elementOfSet.remove("element");
		elementOfSet.remove("set");

		elementOfSet.add("element", element);
		elementOfSet.add("set", set);

		return elementOfSet.render();
	}

	public static String elementOfDom(String element, String set) {
		elementOfDom.remove("element");
		elementOfDom.remove("set");

		elementOfDom.add("element", element);
		elementOfDom.add("set", set);

		return elementOfDom.render();
	}

	public static String elementOfRan(String element, String set) {
		elementOfRan.remove("element");
		elementOfRan.remove("set");

		elementOfRan.add("element", element);
		elementOfRan.add("set", set);

		return elementOfRan.render();
	}

	public static String tableDef(String table, Object definition) {
		tableDef.remove("table_name");
		tableDef.remove("columns_def");

		tableDef.add("table_name", table);
		tableDef.add("columns_def", definition);

		return tableDef.render();
	}

	public static String primaryKeyInvariant(String pkConstraint,
			String recognition) {
		pkInvariant.remove("pkConstraint");
		pkInvariant.remove("recognition");

		pkInvariant.add("pkConstraint", pkConstraint);
		pkInvariant.add("recognition", recognition);

		return pkInvariant.render();
	}
}
