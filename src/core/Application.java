package core;

import core.apps.http.WebDoc;
import tools.composer.Composer;

public class Application {

	public static WebDoc	app = null;
	public Composer			commander = new Composer();
	
	public static void main(String[] args) {	
		System.out.println("Welcome App!");
		setApp(new WebDoc());	
	}
	
	public WebDoc getApp() {
		return app;
	}

	public static void setApp(WebDoc instance) {
		app = instance;
	}

	public Composer getCommander() {
		return commander;
	}

	public void setCommander(Composer command) {
		this.commander = command;
	}
}