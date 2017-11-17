package models.builder.man;

import models.builder.ABuilder;

public class MANBuilder extends ABuilder {

	public MANBuilder() {
		System.out.println("MAN builder is running..");
		this.run();
	}

	@Override
	public boolean build() {
		return false;
	}

}
