package models.dao;

import java.io.File;

import models.factory.AFactory;
import models.factory.JSONFactory;
import models.factory.SQLFactory;
import models.factory.XMLFactory;

public abstract class ADAO<T> {
	
	public abstract boolean create(T obj);

	public abstract boolean edit(T obj);
	
	public abstract boolean delete(T obj);
	
	public abstract T get(int id);
	
	public abstract T get(File file);
	
	public abstract T get(String filename);
	
	@SuppressWarnings("static-access")
	public static AFactory getFactory(EFactoryType type) {
		for (EFactoryType types : type.values()) {
			if (types.JSON.equals(type)) {
				return new JSONFactory();
			} else if (types.SQL.equals(type)) {
				return new SQLFactory();
			} else if (types.XML.equals(type)) {
				return new XMLFactory();
			}
		}
		return null;
	}
}