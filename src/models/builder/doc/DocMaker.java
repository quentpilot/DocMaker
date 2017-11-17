package models.builder.doc;

import core.EApplication;
import models.builder.doc.http.HTTPMaker;
import models.builder.http.deserialize.Deserializer;

public class DocMaker {
	
	protected Deserializer<?>	list = null;
	protected boolean 			status = false;
	protected EApplication		app;
	protected AMaker 			doc = null;

	public DocMaker() {}

	public DocMaker(Deserializer<?> deserializer, EApplication type) {
		this.setList(deserializer);
		this.setApp(type);
		this.run();
	}

	protected boolean run() {
		if (!this.build())
			return false;
		return true;
		
	}

	@SuppressWarnings("static-access")
	protected boolean build() {
		for(EApplication types : this.getApp().values()) {
			if (types.HTTP.equals(this.getApp())) {
				this.setDoc(new HTTPMaker(this.getList()));
				break;
			}
		}
		if (this.getDoc().getStatus())
			return true;
		return false;
	}

	public Deserializer<?> getList() {
		return list;
	}

	
	
	public void setList(Deserializer<?> list) {
		this.list = list;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public EApplication getApp() {
		return app;
	}

	public void setApp(EApplication app) {
		this.app = app;
	}

	public AMaker getDoc() {
		return doc;
	}

	public void setDoc(AMaker website) {
		this.doc = website;
	}

}
