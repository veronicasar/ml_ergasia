package airtickets;

import java.util.ArrayList;
import java.util.List;


final public class Customer {
	private String surname;
	private String forename;
	private String address;
	private String telNum;
	private String faxNum;
	private final List<Booking> bookings = new ArrayList<Booking>();

	
	public Customer() {
	}

	
	public Customer(final String surname, final String forename,
			final String address, final String telNum, final String faxNum) {
		this.setSurname(surname);
		this.setForename(forename);
		this.setAddress(address);
		this.setTelNum(telNum);
		this.setFaxNum(faxNum);
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

	
	public String getAddress() {
		return this.address;
	}

	
	public void setAddress(final String address) {
		this.address = address;
	}

	
	public String getTelNum() {
		return this.telNum;
	}

	
	public void setTelNum(final String telNum) {
		this.telNum = telNum;
	}

	
	public String getFaxNum() {
		return this.faxNum;
	}

	
	public void setFaxNum(final String faxNum) {
		this.faxNum = faxNum;
	}

	
	public List<Booking> getBookings() {
		return this.bookings;
	}
}
