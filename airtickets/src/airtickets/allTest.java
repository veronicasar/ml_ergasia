package airtickets;
//import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import airtickets.Booking;
import airtickets.Customer;
import airtickets.Passenger;

public class allTest {

	
	@Test
	public void testStopoverInfo(){
		final StopoverInfo stopoverinfo = new StopoverInfo();
		Assert.assertNotNull(stopoverinfo.getAirport());	
		Assert.assertNotNull(stopoverinfo.getArrivalTime());
		Assert.assertNotNull(stopoverinfo.getDepartureTime());
	}
	
	@Test
	public void City(){
		final City city = new City();
		Assert.assertNotNull(city.getName());
		
	}
	
	@Test
	public void Customer(){
		final Customer customer = new Customer();
		Assert.assertNull(customer.getSurname());
		Assert.assertNull(customer.getForename());
		Assert.assertNull(customer.getAddress());
		Assert.assertNull(customer.getTelNum());
		Assert.assertNull(customer.getFaxNum());
		Assert.assertNotNull(customer.getBookings());
		Assert.assertEquals(0, customer.getBookings().size());
	}
	
	@Test
	public void testGetOpenBookings() {
		final Booking booking = new Booking();
		final Flight flight = new Flight();

		flight.openBooking(booking);
		Assert.assertTrue(0 == booking.getBookingNumber());
		flight.openBooking(booking);
		Assert.assertFalse(0 == booking.getBookingNumber());
		Assert.assertNotNull(flight.getBookings());
		Assert.assertEquals(2, flight.getBookings().size());
	}

	
	
	@Test
	public void testPassenger() {
		final Passenger passenger = new Passenger("test", "test");
		Assert.assertNull(passenger.getForename());
		Assert.assertNull(passenger.getSurname());
		Assert.assertEquals("test", passenger.getForename());
		Assert.assertEquals("test", passenger.getSurname());
	}	
		
	@Test
	public void testAirport(){
		final Airport airport = new Airport();
		Assert.assertNotNull(airport.getCity());
	}
	
	@Test
	public void testAirlineCompany(){
		final AirlineCompany airlinecompany = new AirlineCompany();
		Assert.assertNull(airlinecompany.getName());
		Assert.assertNull(airlinecompany.getFlights());
	
		
	}
	
	@Test
	public void testBooking() {
		final Booking booking = new Booking();
		Assert.assertNull(booking.getBookingNumber());
		Assert.assertNull(booking.getCustomer());
		Assert.assertNotNull(booking.getDate());
		Assert.assertNotNull(booking.getPassengers());
		Assert.assertEquals(0, booking.getPassengers().size());
	}

	
	@Test
	public void testBookingCustomerListOfPassenger() {
		final Customer customer = new Customer();
		final Passenger passenger = new Passenger();
		final List<Passenger> passengers = new ArrayList<Passenger>();
		passengers.add(passenger);

		final Booking booking = new Booking(customer, passengers);
		Assert.assertEquals(customer, booking.getCustomer());
		Assert.assertEquals(passengers, booking.getPassengers());
	}

	
	@Test
	public void testGetSetBookingNumber() {
		final Booking booking = new Booking();
		booking.setBookingNumber(10);
		Assert.assertTrue(10 == booking.getBookingNumber());
	}

	
	@Test
	public void testGetSetCustomer() {
		Customer customer = new Customer();
		final Passenger passenger = new Passenger();
		final List<Passenger> passengers = new ArrayList<Passenger>();
		passengers.add(passenger);

		final Booking booking = new Booking(customer, passengers);
		Assert.assertEquals(customer, booking.getCustomer());

		customer = new Customer();
		booking.setCustomer(customer);
		Assert.assertEquals(customer, booking.getCustomer());
	}

	
	@Test
	public void testGetSetPassengers() {
		final Customer customer = new Customer();
		final Passenger passenger = new Passenger();
		List<Passenger> passengers = new ArrayList<Passenger>();
		passengers.add(passenger);

		final Booking booking = new Booking(customer, passengers);
		Assert.assertEquals(passengers, booking.getPassengers());

		
		passengers = new ArrayList<Passenger>();
		passengers.add(passenger);
		Assert.assertEquals(passengers, booking.getPassengers());
	}
}
