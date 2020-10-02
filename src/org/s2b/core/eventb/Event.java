package org.s2b.core.eventb;

import java.util.ArrayList;

public class Event extends EventBElement {
	public static enum Status {
		ORDINARY, CONVERGENT, ANTICIPATED;
	}

	protected String name;
	protected Status status;
	protected boolean extended;

	protected ArrayList<Event> refineEvents;
	protected ArrayList<Parameter> parameters; // ANY field
	protected ArrayList<Guard> guards; // WHERE field
	protected ArrayList<Witness> witnesses; // WITH field
	protected ArrayList<Action> actions; // THEN field

	public Event(Machine parent) {
		this(parent, "", Status.ORDINARY);
	}

	public Event(Machine parent, String name) {
		this(parent, name, Status.ORDINARY);
	}

	public Event(Machine parent, String name, Status status) {
		super(parent);
		setName(name);
		setStatus(status);
		setExtended(false);

		refineEvents = new ArrayList<Event>();
		parameters = new ArrayList<Parameter>();
		guards = new ArrayList<Guard>();
		witnesses = new ArrayList<Witness>();
		actions = new ArrayList<Action>();
	}

	public String getName() {
		return name;
	}

	public void rename(String name) {
		setName(name);
	}

	public void setName(String name) {
		assert (name != null);
		this.name = name;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		assert (status != null);
		this.status = status;
	}

	public boolean isExtended() {
		return extended;
	}

	public void setExtended(boolean extended) {
		this.extended = extended;
	}

	public Event getRefineEvent(int index) {
		return refineEvents.get(index);
	}

	public ArrayList<Event> getRefineEvents() {
		return refineEvents;
	}

	public void addRefineEvent(Event evt) {
		assert (evt != null);
		refineEvents.add(evt);
	}

	public Parameter getParameter(int index) {
		return parameters.get(index);
	}

	public ArrayList<Parameter> getParameters() {
		return parameters;
	}

	public void addParameter(Parameter prm) {
		assert (prm != null);
		parameters.add(prm);
	}

	public Guard getGuard(int index) {
		return guards.get(index);
	}

	public ArrayList<Guard> getGuards() {
		return guards;
	}

	public void addGuards(Guard grd) {
		assert (grd != null);
		guards.add(grd);
	}

	public Witness getWitness(int index) {
		return witnesses.get(index);
	}

	public ArrayList<Witness> getWitnesses() {
		return witnesses;
	}

	public void addWitness(Witness wit) {
		assert (wit != null);
		witnesses.add(wit);
	}

	public Action getAction(int index) {
		return actions.get(index);

	}

	public ArrayList<Action> getActions() {
		return actions;
	}

	public void addActions(Action act) {
		assert (act != null);
		actions.add(act);
	}

	@Override
	public String getAutoElementPrefix() {
		return "evt";
	}

}
