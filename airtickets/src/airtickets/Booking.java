package airtickets;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import airtickets.Passenger;


public class Booking {
	private Integer number;
	private final Date date = new Date();
	private Customer customer;
	private List<Passenger> passengers = new ArrayList<Passenger>();

	
	public Booking() {
	}

	
	public Booking(final Customer customer, final List<Passenger> passengers) {
		this.setCustomer(customer);
		this.setPassengers(passengers);
	}

	
	public Integer getBookingNumber() {
		return this.number;
	}

	
	public void setBookingNumber(final Integer bookingNumber) {
		this.number = bookingNumber;
	}

	
	public Date getDate() {
		return this.date;
	}

	
	public Customer getCustomer() {
		return this.customer;
	}

	
	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	
	public List<Passenger> getPassengers() {
		return this.passengers;
	}

	
	public void setPassengers(final List<Passenger> passengers) {
		this.passengers = passengers;
	}
}
