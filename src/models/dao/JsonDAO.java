package models.dao;

import models.factory.EFactory;

public class JsonDAO<T> extends DAO<T> {

	public JsonDAO() {
		super();
	}

	public boolean create(T obj) {
		System.out.println(this.getClass().getName() + " is creating...");
		return false;
	}
	 
	public boolean edit(T obj) {
		System.out.println(this.getClass().getName() + " is editing...");
		return false;
	}
	 
	public boolean delete(T obj) {
		System.out.println(this.getClass().getName() + " is deleting...");
		return false;
	}
	 
	public T get(int id) {
		System.out.println(this.getClass().getName() + " is getting " + id + "...");
		return null;
	}
	 
	public T get(T pojo) {
		return null;
	}
	 
	public T get(EFactory pojo) {
		return null;
	}
 
	public T get(String filename) {
		return null;
	}
}
