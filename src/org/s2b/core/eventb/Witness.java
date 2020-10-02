package org.s2b.core.eventb;

public class Witness extends EventBElement {
	protected String label;
	protected String predicate;

	public Witness(Event parent) {
		this(parent, "", "");
	}

	public Witness(Event parent, String label) {
		this(parent, label, "");
	}

	public Witness(Event parent, String label, String predicate) {
		super(parent);
		setLabel(label);
		setPredicate(predicate);
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}

	public String getPredicate() {
		return predicate;
	}

	@Override
	public String getAutoElementPrefix() {
		return "wit";
	}
}
