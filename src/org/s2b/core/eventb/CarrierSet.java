package org.s2b.core.eventb;

public class CarrierSet extends EventBElement {
	protected String identifier;

	public CarrierSet(Context parent) {
		this(parent, "");
	}

	public CarrierSet(Context parent, String identifier) {
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
		return "set";
	}
}
