package models.dao.tables;

import models.dao.JsonDAO;

public class JsonPageDAO<T> extends JsonDAO<T> {

	 
	public boolean create(T obj) {
		return false;
	}
	 
	public boolean edit(T obj) {
		return false;
	}
	 
	public boolean delete(T obj) {
		return false;
	}
	 
	public T get(int id) {
		return null;
	}
	 
	public T get(T pojo) {
		return null;
	}
	 
	public T get(String filename) {
		return null;
	}

	
}
