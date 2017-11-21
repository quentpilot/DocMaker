package models.builder;

import core.apps.IApplications;
import models.builder.http.HTTPBuilder;
import models.builder.java.JAVABuilder;
import models.builder.man.MANBuilder;

public class AppBuilder extends ABuilder implements IApplications {

	protected ABuilder builder = null; 
	
	public AppBuilder(EBuilder app) {
		this.setApp(app);
		this.run();
	}

	@SuppressWarnings({ "static-access"})
	public boolean build() {
		for (EBuilder types : this.getApp().values()) {
			if (types.HTTP.equals(this.getApp())) {
				return this.run_http();
			} else if (types.MAN.equals(this.getApp())) {
				return this.run_man();
			} else if (types.JAVA.equals(this.getApp())) {
				return this.run_java();
			}
		}
		return false;
	}

	public ABuilder getBuilder() {
		return builder;
	}

	public void setBuilder(ABuilder builder) {
		this.builder = builder;
	}

	@Override
	public boolean run_http() {
		this.setBuilder(new HTTPBuilder());
		if (this.getBuilder().getStatus())
			return true;
		return false;
	}

	@Override
	public boolean run_man() {
		this.setBuilder(new MANBuilder());
		if (this.getBuilder().getStatus())
			return true;
		return false;
	}

	@Override
	public boolean run_java() {
		this.setBuilder(new JAVABuilder());
		if (this.getBuilder().getStatus())
			return true;
		return false;
	}

}
