package org.s2b.core.eventb;

public class Variable extends EventBElement {
	protected String identifier;

	public Variable(Machine parent) {
		this(parent, "");
	}

	public Variable(Machine parent, String identifier) {
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
		return "var";
	}

}
