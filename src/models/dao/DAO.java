package models.dao;

public class DAO<T> extends ADAO<T> {

	public DAO() {
		System.out.println(this.getClass().getName() + " is running...");
	}
	 
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
