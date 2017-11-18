package core.apps;

import tools.composer.Composer;

public interface IApplication {
	
	public Composer 	commander = new Composer();
	
	public abstract boolean run();
	
	public abstract boolean build();
	
	public static IApplication getApp() {
		return null;
	}
	
	public static void setApp(IApplication app) {
		app = null;
	}
	
	public Composer getCommander();

	public void setCommander(Composer command);
}
