package core.apps.man;

import core.apps.IApplication;
import tools.composer.Composer;

public class ManDoc implements IApplication {
	
	public Composer 	commander = new Composer();

	public ManDoc() {}
	
	public boolean run() {
		if (!build())
			return false;
		return true;
	}

	public boolean build() {
		return false;
	}
	
	public Composer getCommander() {
		return commander;
	}

	public void setCommander(Composer command) {
		this.commander = command;
	}
}
