package models.builder.http.serialize;

public class Serializer<T> {
	
	protected StringBuilder	list;

	public Serializer() {}

	public StringBuilder getList() {
		return list;
	}

	public void setList(StringBuilder list) {
		this.list = list;
	}

}
