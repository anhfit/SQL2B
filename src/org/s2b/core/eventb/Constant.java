package org.s2b.core.eventb;

public class Constant extends EventBElement {
	protected String identifier;

	public Constant(Context parent) {
		this(parent, "");
	}

	public Constant(Context parent, String identifier) {
		super(parent);
		setIdentifier(identifier);
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}

	@Override
	public String getAutoElementPrefix() {
		return "cst";
	}
}
