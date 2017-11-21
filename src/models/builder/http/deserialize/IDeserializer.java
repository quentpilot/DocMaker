package models.builder.http.deserialize;

import java.util.ArrayList;

import models.dao.ADAO;

public interface IDeserializer {
	
	public ArrayList<?> stack();
	
	public ADAO<?> getDao();

	public void setDao(ADAO<?> dao);
	
}
