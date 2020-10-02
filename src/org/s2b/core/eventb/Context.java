package org.s2b.core.eventb;

import java.util.ArrayList;

public class Context extends EventBElement {
	protected String name;
	protected ArrayList<Context> extendContexts;
	protected ArrayList<CarrierSet> carrierSets;
	protected ArrayList<Constant> constants;
	protected ArrayList<Axiom> axioms;

	public Context(Project parent, String name) {
		super(parent);
		setName(name);
		extendContexts = new ArrayList<Context>();
		carrierSets = new ArrayList<CarrierSet>();
		constants = new ArrayList<Constant>();
		axioms = new ArrayList<Axiom>();
	}

	public void rename(String name) {
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addExtendContext(Context c) {
		assert (c != this);
		extendContexts.add(c);
	}

	public void addCarrierSet(CarrierSet set) {
		assert (set != null);
		carrierSets.add(set);
		set.setParent(this);
	}

	public void addConstant(Constant cst) {
		constants.add(cst);
		cst.setParent(this);
	}

	public void addAxiom(Axiom axm) {
		axioms.add(axm);
		axm.setParent(this);
	}

	public String getName() {
		return name;
	}

	public Context getExtentContext(int index) {
		return extendContexts.get(index);
	}

	public ArrayList<Context> getExtendContexts() {
		return extendContexts;
	}

	public CarrierSet getCarrierSet(int index) {
		return carrierSets.get(index);
	}

	public ArrayList<CarrierSet> getCarrierSets() {
		return carrierSets;
	}

	public Constant getConstant(int index) {
		return constants.get(index);
	}

	public ArrayList<Constant> getConstants() {
		return constants;
	}

	public Axiom getAxiom(int index) {
		return axioms.get(index);
	}

	public ArrayList<Axiom> getAxioms() {
		return axioms;
	}

	@Override
	public String getAutoElementPrefix() {
		return "cxt";
	}

}
