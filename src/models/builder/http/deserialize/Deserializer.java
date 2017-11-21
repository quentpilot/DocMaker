package models.builder.http.deserialize;

import java.util.ArrayList;
import java.util.Collection;

import models.dao.ADAO;
import models.dao.EFactoryType;
import models.dao.JsonDAO;
import models.pojo.APOJO;

public class Deserializer<T> extends ArrayList<Object> {

	private static final long 	serialVersionUID = 1L;
	protected EFactoryType		format;
	protected boolean 			status = false;
	protected ADAO<?>			dao = null;
	protected IDeserializer		json = null;

	public Deserializer() {}

	public Deserializer(int initialCapacity) {
		super();
	}

	public Deserializer(Collection<? extends APOJO> c) {
		super(c);
	}

	public Deserializer(EFactoryType type) {
		this.setFormat(type);
		this.run();
	}

	protected boolean run() {
		this.setStatus(this.build());
		if (this.getStatus())
			return true;
		return false;
	}
	
	@SuppressWarnings("static-access")
	protected boolean build() {
		for (EFactoryType type : this.getFormat().values()) {
			if (type.JSON.equals(this.getFormat())) {
				return this.stackJSON();
			} else if (type.SQL.equals(this.getFormat())) {
				return this.stackSQL();
			} else if (type.XML.equals(this.getFormat())) {
				return this.stackXML();
			}
		}
		return false;
	}
	
	protected boolean stackJSON() {
		Collection<? extends Object> list = null;
		
		this.setDao(new JsonDAO<>());
		this.setJson(new JSONDeserializer(this.getDao()));
		list = (Collection<? extends Object>) this.getJson().stack();
		if (list != null) {
			this.addAll(list);
			return true;
		}
		return false;
	}
	
	protected boolean stackXML() {
		return false;
	}

	protected boolean stackSQL() {
		return false;
	}
	
	public EFactoryType getFormat() {
		return format;
	}

	public void setFormat(EFactoryType format) {
		this.format = format;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public ADAO<?> getDao() {
		return dao;
	}

	public void setDao(ADAO<?> dao) {
		this.dao = dao;
	}

	public IDeserializer getJson() {
		return json;
	}

	public void setJson(IDeserializer json) {
		this.json = json;
	}

}
