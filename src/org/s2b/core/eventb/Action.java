package org.s2b.core.eventb;

/**
 * THEN field in Event
 */
public class Action extends EventBElement {
	protected String label;
	protected String assignment; // Generalized Substitution

	public Action(Event parent) {
		this(parent, "", "");
	}

	public Action(Event parent, String label) {
		this(parent, label, "");
	}

	public Action(Event parent, String label, String substitution) {
		super(parent);
		setLabel(label);
		setAssignment(substitution);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAssignment() {
		return assignment;
	}

	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}

	@Override
	public String getAutoElementPrefix() {
		return "act";
	}

}
