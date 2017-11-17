package core.apps.http;

import models.builder.ABuilder;
import models.builder.*;

public class WebDoc {

	protected ABuilder 		builder = null;
	
	public WebDoc() {
		System.out.println("Welcome to WebDoc factory");
		this.setBuilder(new AppBuilder(EBuilder.HTTP));
	}

	public ABuilder getBuilder() {
		return builder;
	}

	public void setBuilder(ABuilder builder) {
		this.builder = builder;
	}	
}
