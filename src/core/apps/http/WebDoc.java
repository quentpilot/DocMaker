package core.apps.http;

import core.apps.IApplication;
import models.builder.ABuilder;
import models.builder.AppBuilder;
import models.builder.EBuilder;
import tools.composer.Composer;

public class WebDoc implements IApplication {

	public Composer 		commander = new Composer();
	protected ABuilder 		builder = null;
	
	public WebDoc() {
		System.out.println("Welcome to WebDoc factory");
		this.setBuilder(new AppBuilder(EBuilder.HTTP));
	}

	public boolean run() {
		if (!build())
			return false;
		return true;
	}

	public boolean build() {
		return false;
	}
	
	public ABuilder getBuilder() {
		return builder;
	}

	public void setBuilder(ABuilder builder) {
		this.builder = builder;
	}
	
	public Composer getCommander() {
		return commander;
	}

	public void setCommander(Composer command) {
		this.commander = command;
	}
}
