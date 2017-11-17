package models.factory;

import models.pojo.APOJO;
import models.pojo.http.*;

public abstract class AFactory {
	
	protected EFactory 	type;

	protected APOJO 	template = null;
	
	@SuppressWarnings("static-access")
	public static Object get(EFactory pojo) {
		for (EFactory types : pojo.values()) {
			if (types.Page.equals(pojo)) {
				return new Page();
			} else if (types.Article.equals(pojo)) {
				return new Article();
			} else if (types.Item.equals(pojo)) {
				return new Item();
			} else if (types.Menu.equals(pojo)) {
				return new Menu();
			}
		}
		return null;
	}
	
	public EFactory getType() {
		return type;
	}

	public void setType(EFactory type) {
		this.type = type;
	}

	public APOJO getTemplate() {
		return template;
	}

	public void setTemplate(APOJO template) {
		this.template = template;
	}
}
