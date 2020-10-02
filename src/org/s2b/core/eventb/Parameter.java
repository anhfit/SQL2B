package org.s2b.core.eventb;

/**
 * ANY field in Event
 */
public class Parameter extends EventBElement {
	protected String identifier;

	public Parameter(Event parent) {
		this(parent, "");
	}

	public Parameter(Event parent, String identifier) {
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
		return "prm";
	}
}
