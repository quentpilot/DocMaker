package models.builder;

import models.builder.doc.DocMaker;
import models.builder.http.deserialize.Deserializer;
import models.builder.http.serialize.Serializer;
import models.dao.ADAO;

public abstract class ABuilder {

	protected static ADAO<?>			dao = null;
	protected EBuilder 					app;
	protected boolean 					status = false;
	protected Deserializer<?>			deserialize = null;
	protected Serializer<?>				serialize = null;
	protected DocMaker					documentation = null;
	
	public boolean run() {
		if (!this.build()) {
			System.out.println("An error occured when running " + this.getClass().getName() + "!");
			return false;
		}
		this.setStatus(true);
		return true;
	}
	
	public abstract boolean build();
	
	public boolean clean() {
		this.setApp(null);
		this.setDao(null);
		this.setStatus(false);
		return true;
	}

	public ADAO<?> getDao() {
		return dao;
	}

	public void setDao(ADAO<?> dao) {
		ABuilder.dao = dao;
	}

	public EBuilder getApp() {
		return app;
	}

	public void setApp(EBuilder app) {
		this.app = app;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Serializer<?> getSerialize() {
		return serialize;
	}

	public void setSerialize(Serializer<?> serialize) {
		this.serialize = serialize;
	}

	public Deserializer<?> getDeserialize() {
		return deserialize;
	}

	public void setDeserialize(Deserializer<?> deserialize) {
		this.deserialize = deserialize;
	}

	public DocMaker getDocumentation() {
		return documentation;
	}

	public void setDocumentation(DocMaker documentation) {
		this.documentation = documentation;
	}
}