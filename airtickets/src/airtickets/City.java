 package airtickets;


final public class City {
	private String name = null;

	public City() {
	}

	
	public City(final String name) {
		this.setName(name);
	}

	
	public String getName() {
		return this.name;
	}

	
	public void setName(final String name) {
		this.name = name;
	}

}
