package airtickets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import airtickets.Booking;


final public class Flight extends GenericFlight {
	private int bookingId = 0;
	private final List<Booking> bookings = new ArrayList<Booking>();

	public Flight() {
		super();
	}

	public Flight(final Date departureTime, final Date arrivalTime,
			final Airport departureAirport, final Airport arrivalAirport,
			final long validityPeriod) {
		super(departureTime, arrivalTime, departureAirport, arrivalAirport,
				validityPeriod);
	}

	
	public List<Booking> getBookings() {
		return Collections.unmodifiableList(this.bookings);
	}

	
	public void openBooking(final Booking booking) {
		// Set booking number
		booking.setBookingNumber(this.bookingId);
		this.bookings.add(booking);
		// Increment booking number.
		this.bookingId++;
	}

	
	public void closeBooking(final Booking booking) {
		this.bookings.remove(booking);
	}
}
