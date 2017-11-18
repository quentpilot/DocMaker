package core.apps;

public enum EApplication {
	HTTP("Website"),
	MAN("UNIX Manual"),
	JAVA("Javadoc");
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	EApplication(String type) {
		this.setName(type);
	}
}
