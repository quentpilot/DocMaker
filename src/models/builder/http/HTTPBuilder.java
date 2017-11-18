package models.builder.http;

import java.util.ArrayList;

import core.apps.EApplication;
import models.builder.ABuilder;
import models.builder.doc.DocMaker;
import models.builder.http.deserialize.Deserializer;
import models.dao.EFactoryType;
import models.dao.JsonDAO;

public class HTTPBuilder extends ABuilder { 
	
	public HTTPBuilder() {
		System.out.println(this.getClass().getName() + " builder is running..");
		this.setDao(new JsonDAO<>());
		this.run();
	}
	
	public boolean build() {
		// build POJO from DB
		this.setDeserialize(new Deserializer<ArrayList<?>>(EFactoryType.JSON, this.getDao()));
		if (!this.getDeserialize().getStatus())
			return false;
		
		// build templates (doc) from POJO Array
		this.setDocumentation(new DocMaker(this.getDeserialize(), EApplication.HTTP));
		if (this.getDocumentation().getStatus())
			return true;
		return false;
	}
}
