package core;

import core.apps.IApplication;
import core.apps.IApplications;
import core.apps.http.WebDoc;
import core.apps.java.JavaDoc;
import core.apps.man.ManDoc;
import tools.composer.Composer;

public class Application implements IApplication , IApplications {

	public static IApplication	app = null;
	public Composer				commander = null;
	
	public Application () {}
	
	public Application (String[] options) {	
		System.out.println("Welcome App!");
		this.run();
	}
	
	public Application (Composer cmd) {	
		System.out.println("Welcome App!");
		this.setCommander(cmd);
		this.run();
	}
	
	public boolean run() {
		if (!build())
			return false;
		return true;
	}

	public boolean build() {
		setApp(new WebDoc());
		return false;
	}
	
	public boolean run_http() {
		setApp(new WebDoc());
		return false;
	}

	public boolean run_man() {
		setApp(new ManDoc());
		return false;
	}

	public boolean run_java() {
		setApp(new JavaDoc());
		return false;
	}
	
	public IApplication getApp() {
		return app;
	}

	public static void setApp(IApplication instance) {
		app = instance;
	}
	
	public Composer getCommander() {
		return commander;
	}

	public void setCommander(Composer command) {
		this.commander = command;
	}
}