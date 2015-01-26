package airtickets;

final public class Airport {
	private City city = null;

	
	public Airport() {
	}

	
	public Airport(final City city) {
		this.setCity(city);
	}

	
	public City getCity() {
		return this.city;
	}

	
	public void setCity(final City city) {
		this.city = city;
	}
}
