package org.s2b.core.eventb;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public abstract class EventBElement {
	protected EventBElement parent;

	protected static STGroup stringTemplate;
	protected static STGroup xmlTemplate;
	public static final STGroup DEFAULT_STRING_TEMPLATE;
	public static final STGroup DEFAULT_XML_TEMPLATE;

	static {
		DEFAULT_STRING_TEMPLATE = new STGroupFile("./res/templates/string.stg");
		DEFAULT_XML_TEMPLATE = new STGroupFile("./res/templates/xml.stg", '$',
				'$');

		setStringTemplate(DEFAULT_STRING_TEMPLATE);
		setXMLTemplate(DEFAULT_XML_TEMPLATE);
	}

	public static void setStringTemplate(STGroup stg) {
		stringTemplate = stg;
	}

	public static void setXMLTemplate(STGroup stg) {
		xmlTemplate = stg;
	}

	public EventBElement(EventBElement parent) {
		setParent(parent);
	}

	public void setParent(EventBElement parent) {
		this.parent = parent;
	}

	public EventBElement getParent() {
		return parent;
	}

	public abstract String getAutoElementPrefix();

	public String toXML() {
		String ruleName = this.getClass().getSimpleName().toLowerCase();
		ST template = xmlTemplate.getInstanceOf(ruleName);
		template.add(getAutoElementPrefix(), this);

		return template.render();
	}

	public String toString() {
		String ruleName = this.getClass().getSimpleName().toLowerCase();
		ST template = stringTemplate.getInstanceOf(ruleName);
		template.add(getAutoElementPrefix(), this);

		return template.render();
	}
}
