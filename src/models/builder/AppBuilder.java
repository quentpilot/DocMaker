package models.builder;

import models.builder.http.HTTPBuilder;
import models.builder.java.JAVABuilder;
import models.builder.man.MANBuilder;

public class AppBuilder extends ABuilder {

	protected ABuilder builder = null; 
	
	public AppBuilder(EBuilder app) {
		this.setApp(app);
		this.run();
	}

	@SuppressWarnings({ "static-access"})
	public boolean build() {
		for (EBuilder types : this.getApp().values()) {
			if (types.HTTP.equals(this.getApp())) {
				this.setBuilder(new HTTPBuilder());
				break;
			} else if (types.MAN.equals(this.getApp())) {
				this.setBuilder(new MANBuilder());
				break;
			} else if (types.JAVA.equals(this.getApp())) {
				this.setBuilder(new JAVABuilder());
				break;
			}
		}
		if (this.getBuilder().getStatus())
			return true;
		return false;
	}

	public ABuilder getBuilder() {
		return builder;
	}

	public void setBuilder(ABuilder builder) {
		this.builder = builder;
	}

}
