package org.s2b.core.eventb.test;

import org.s2b.core.eventb.*;
import org.stringtemplate.v4.*;
import static org.s2b.core.eventb.FormulaFactory.*;

@SuppressWarnings("unused")
public class TestToStringMethod {

	public static void main(String[] args) {
		// Event evt1 = new Event(null, "evt1");
		// evt1.addRefineEvent(new Event(null, "refine_event1"));
		// evt1.addRefineEvent(new Event(null, "refine_event2"));
		// evt1.addParameter(new Parameter(null, "prm1"));
		// evt1.addParameter(new Parameter(null, "prm2"));
		// evt1.addParameter(new Parameter(null, "prm3"));
		// evt1.addGuards(new Guard(null, "grd1", "cars_go = FALSE"));
		// evt1.addGuards(new Guard(null, "grd2", "peds_go = FALSE"));
		// // no witnesses
		// evt1.addActions(new Action(null, "act1", "peds_colour := green"));
		// evt1.addActions(new Action(null, "act2", "cars_colour := green"));
		// evt1.addActions(new Action(null, "act3", "x, y := x + z, y - z"));
		//
		// Machine mac = new Machine(null, "test_mac");
		// mac.addEvent(evt1);
		// mac.setRefineMachine(new Machine(null, "ref"));
		// mac.addSeeContext(new Context(null, "ctx1"));
		// mac.addSeeContext(new Context(null, "ctx2"));
		// mac.addVariable(new Variable(null, "r"));
		// mac.addVariable(new Variable(null, "R"));
		// mac.addVariable(new Variable(null, "b"));
		//
		// Context cxt = new Context(null, "test_cxt");
		// cxt.addExtendContext(new Context(null, "ext_context1"));
		// cxt.addExtendContext(new Context(null, "ext_context2"));
		// cxt.addExtendContext(new Context(null, "ext_context3"));
		// cxt.addCarrierSet(new CarrierSet(null, "COLORS"));
		// cxt.addCarrierSet(new CarrierSet(null, "FRUST"));
		// cxt.addConstant(new Constant(null, "red"));
		// cxt.addConstant(new Constant(null, "yellow"));
		// cxt.addConstant(new Constant(null, "green"));
		// cxt.addAxiom(new Axiom(null, "type",
		// "partition(COLORS,{red},{yellow},{green})", true));
		//
		// String result = cxt.toString();
		// System.out.println(result);

		String[] eles = new String[] { "first", "second", "third" };
		System.out.println(primaryKeyInvariant("pk_bonus", "bonus_rec"));
		System.out.println(primaryKeyInvariant("pk_element", "element_rec"));
	}

}
