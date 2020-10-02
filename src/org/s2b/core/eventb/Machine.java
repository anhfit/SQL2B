package org.s2b.core.eventb;

import java.util.ArrayList;

public class Machine extends EventBElement {
	protected String name;
	protected Machine refineMachine;
	protected ArrayList<Context> seeContexts;
	protected ArrayList<Variable> variables;
	protected ArrayList<Invariant> invariants;
	protected ArrayList<Event> events;
	protected Variant variant;

	public Machine(Project parent, String name) {
		super(parent);
		setName(name);
		seeContexts = new ArrayList<Context>();
		variables = new ArrayList<Variable>();
		invariants = new ArrayList<Invariant>();
		events = new ArrayList<Event>();
	}

	public void rename(String name) {
		setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRefineMachine(Machine m) {
		assert (m != this);
		this.refineMachine = m;
	}

	public void addSeeContext(Context c) {
		assert (c != null);
		seeContexts.add(c);
	}

	public void addVariable(Variable var) {
		assert (var != null);
		variables.add(var);
		var.setParent(this);
	}

	public void addInvariant(Invariant inv) {
		assert (inv != null);
		invariants.add(inv);
		inv.setParent(this);
	}

	public void addEvent(Event evt) {
		assert (evt != null);
		events.add(evt);
		evt.setParent(this);
	}

	public void setVariant(Variant vrt) {
		variant = vrt;
	}

	public String getName() {
		return name;
	}

	public Machine getRefineMachine() {
		return refineMachine;
	}

	public Context getSeeContext(int index) {
		return seeContexts.get(index);
	}

	public ArrayList<Context> getSeeContexts() {
		return seeContexts;
	}

	public Variable getVariable(int index) {
		return variables.get(index);
	}

	public ArrayList<Variable> getVariables() {
		return variables;
	}

	public Invariant getInvariant(int index) {
		return invariants.get(index);
	}

	public ArrayList<Invariant> getInvariants() {
		return invariants;
	}

	public Event getEvent(int index) {
		return events.get(index);
	}

	public ArrayList<Event> getEvents() {
		return events;
	}

	public Variant getVariant() {
		return variant;
	}

	@Override
	public String getAutoElementPrefix() {
		return "mac";
	}
}
