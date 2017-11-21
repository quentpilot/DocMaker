package models.builder.http.deserialize;

import java.io.File;
import java.util.ArrayList;

import models.dao.ADAO;
import models.dao.tables.JsonPageDAO;
import models.pojo.APOJO;
import models.pojo.http.Page;

public class JSONDeserializer implements IDeserializer {
	
	protected ADAO<?>				dao = null;
	protected APOJO					pojo = null;

	public JSONDeserializer() {}
	
	public JSONDeserializer(ADAO<?> db) {
		this.setDao(db);
	}

	public ArrayList<?> stack() {
		ArrayList<?> list = null;
		list = this.buildStack();
		return list;
	}

	@SuppressWarnings("null")
	protected ArrayList<?> buildStack() {
		ArrayList<Object>	list = null;
		String 				path = "resources/database/http/json/";
		File[]				data = this.stackFiles(path);
		return list;
	}
	
	protected File[] stackFiles(String path) {
		File 				dir = new File(path);
		File[]				data = dir.listFiles();
		
		for (File file : data) {
			if (file.isDirectory()) {
				this.stackFiles(file.getAbsolutePath());
			}
			else if (file.isFile()) {
				ADAO<Page> format = new JsonPageDAO();
		
				this.setDao(format);
				this.setPojo((APOJO) this.getDao().get(file));
				System.out.println("File deserialized => " + this.getPojo().getPath());
			}
		}
		return null;
	}

	public ADAO<?> getDao() {
		return dao;
	}

	public void setDao(ADAO<?> dao) {
		this.dao = dao;
	}

	public APOJO getPojo() {
		return pojo;
	}

	public void setPojo(APOJO pojo) {
		this.pojo = pojo;
	}
}
