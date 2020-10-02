package org.s2b.core.eventb;

public class Variant extends EventBElement {
	protected String expression;

	public Variant(Machine parent) {
		this(parent, "");
	}

	public Variant(Machine parent, String expression) {
		super(parent);
		setExpression(expression);
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getExpression() {
		return expression;
	}

	@Override
	public String getAutoElementPrefix() {
		return "vrt";
	}

}
