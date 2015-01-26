package airtickets;

final public class Passenger {
	private String surname = null;
	private String forename = null;

	
	public Passenger() {
	}

	
	public Passenger(final String surname, final String forename) {
		this.setSurname(surname);
		this.setForename(forename);
	}

	
	public String getSurname() {
		return this.surname;
	}

	
	public void setSurname(final String surname) {
		this.surname = surname;
	}

	
	public String getForename() {
		return this.forename;
	}

	
	public void setForename(final String forename) {
		this.forename = forename;
	}
}
