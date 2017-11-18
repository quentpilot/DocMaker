package core;

import tools.composer.Composer;

public final class DocMaker {

	public static Composer	command = null;
	
	public static void main(String[] options) {
		setCommand(new Composer(options));
		new Application(getCommand());
	}
	
	private static Composer getCommand() {
		return command;
	}
	
	private static void setCommand(Composer cmd) {
		command = cmd;
	}
}
