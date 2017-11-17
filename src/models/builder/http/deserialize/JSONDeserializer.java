package models.builder.http.deserialize;

import java.util.ArrayList;

import models.dao.ADAO;

public class JSONDeserializer implements IDeserializer {
	
	protected ADAO<?> 	dao = null;

	public JSONDeserializer() {}
	
	public JSONDeserializer(ADAO<?> db) {
		this.setDao(db);
	}

	public ArrayList<?> stack() {
		return null;
	}

	public ADAO<?> getDao() {
		return dao;
	}

	public void setDao(ADAO<?> dao) {
		this.dao = dao;
	}

}
