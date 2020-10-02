package org.s2b.core.eventb;

public class Invariant extends EventBElement {
	protected String label;
	protected String predicate;
	protected boolean isTheorem;

	public Invariant(Context parent) {
		this(parent, "", "", false);
	}

	public Invariant(Context parent, String label, String predicate) {
		this(parent, label, predicate, false);
	}

	public Invariant(Context parent, String label, String predicate,
			boolean isTheorem) {
		super(parent);
		setLabel(label);
		setPredicate(predicate);
		setTheorem(isTheorem);
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setPredicate(String predicate) {
		this.predicate = predicate;
	}

	public void setTheorem(boolean isTheorem) {
		this.isTheorem = isTheorem;
	}

	public String getLabel() {
		return label;
	}

	public String getPredicate() {
		return predicate;
	}

	public boolean isTheorem() {
		return isTheorem;
	}

	@Override
	public String getAutoElementPrefix() {
		return "inv";
	}

}
