package models.dao;

import java.io.File;

public class DAO<T> extends ADAO<T> {

	public DAO() {}
	 
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

	public T get(File file) {
		return null;
	}
}
