package org.s2b.core.eventb;

import java.io.*;
import java.util.ArrayList;

public class Project extends EventBElement {
	protected String name;
	protected ArrayList<Machine> machines;
	protected ArrayList<Context> contexts;

	public Project(String name) {
		super(null);
		assert ((name != null) && (!name.equals("")));
		setName(name);
		machines = new ArrayList<Machine>();
		contexts = new ArrayList<Context>();
	}

	public void rename(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMachine(Machine m) {
		machines.add(m);
	}

	public void addContext(Context c) {
		contexts.add(c);
	}

	public String getName() {
		return name;
	}

	public Machine getMachine(int index) {
		return machines.get(index);
	}

	public ArrayList<Machine> getMachines() {
		return machines;
	}

	public Context getContext(int index) {
		return contexts.get(index);
	}

	public ArrayList<Context> getContexts() {
		return contexts;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public String getAutoElementPrefix() {
		return "prj";
	}

	/**
	 * Save project into default directory
	 */
	public void save() {
		save("./res/rodin/", false);
	}

	private void writeToFile(String fos, String data) {
		try (Writer out = new OutputStreamWriter(new FileOutputStream(fos),
				"UTF-8")) {
			out.write(data);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void save(String directory, boolean subFolder) {
		if (!(directory.endsWith("\\") || directory.endsWith("/"))) {
			directory += "/";
		}
		if (subFolder) {
			directory += this.getName() + "/";
		}

		writeToFile(directory + ".project", this.toXML());
		for (Context context : getContexts()) {
			writeToFile(directory + context.getName() + ".buc", context.toXML());
		}

		for (Machine machine : getMachines()) {
			writeToFile(directory + machine.getName() + ".bum", machine.toXML());
		}
	}
}
