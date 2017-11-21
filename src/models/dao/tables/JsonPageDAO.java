package models.dao.tables;

import java.io.File;
import com.google.gson.Gson;
import models.dao.JsonDAO;
import models.pojo.http.Page;
import tools.read.Reader;

public class JsonPageDAO extends JsonDAO<Page> {

	public JsonPageDAO() {
		super();
	}
	 
	public boolean create(Page	 obj) {
		return false;
	}
	 
	public boolean edit(Page obj) {
		return false;
	}
	 
	public boolean delete(Page obj) {
		return false;
	}
	 
	public Page get(int id) {
		return null;
	}
	 
	public Page get(Page pojo) {
		return null;
	}
	 
	public Page get(String filename) {
		return null;
	}
	
	@SuppressWarnings("unused")
	public Page get(File file) {
		
		Page 	page = new Page();
		String	path = file.getAbsolutePath();
		Reader 	reader = new Reader(path);
		Gson	db = new Gson();
		
		page = db.fromJson("{\"path\": \"" + path + "\"}", Page.class);
		return page;
	
	}
}
