package airtickets;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


final public class AirlineCompany {
	private String name = null;
	private final Map<Integer, GenericFlight> flights = new HashMap<Integer, GenericFlight>();

	public AirlineCompany() {
	}
	
	public AirlineCompany(final String name) {
		this.setName(name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public Map<Integer, GenericFlight> getFlights() {
		return Collections.unmodifiableMap(this.flights);
	}
	
	public int registerFlight(final GenericFlight flight) {
		// Register a flight, use the size of the hash to generate a flight
		// number.
		final Integer num = this.flights.size();
		this.flights.put(num, flight);
		flight.setFlightNumber(num);
		return num;
	}
	
	public void unregisterFlight(final Integer flightNumber) {
		if (this.flights.containsKey(flightNumber)) {
			this.flights.get(flightNumber).setFlightNumber(null);
			// Set the flight number to null (can't remove as that would set the
			// next flight at the wrong number/index.
			this.flights.put(flightNumber, null);
		}
	}
}

