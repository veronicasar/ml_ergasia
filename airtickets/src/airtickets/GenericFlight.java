package airtickets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public abstract class GenericFlight {
	private Date departureTime = null;
	private Date arrivalTime = null;
	private long validityPeriod = 0;
	private Airport departureAirport = null;
	private Airport arrivalAirport = null;
	private final List<StopoverInfo> stopovers = new ArrayList<StopoverInfo>();
	private Integer flightNumber = null;

	
	public GenericFlight() {
	}

	
	public GenericFlight(final Date departureTime, final Date arrivalTime,
			final Airport departureAirport, final Airport arrivalAirport,
			final long validityPeriod) {
		this.setDepartureTime(departureTime);
		this.setArrivalTime(arrivalTime);
		this.setDepartureAirport(departureAirport);
		this.setArrivalAirport(arrivalAirport);
		this.setValidityPeriod(validityPeriod);
	}

	
	public Date getDepartureTime() {
		return this.departureTime;
	}

	
	public void setDepartureTime(final Date departureTime) {
		// Check if the new the departure time is not null;
		if (departureTime != null) {
			// If an arrival time is not set, accept the new departure time.
			// Or if an arrival time is set, accept the new departure time only
			// if it is before the arrival time.
			if ((this.getArrivalTime() == null)
					|| departureTime.before(this.getArrivalTime())) {
				this.departureTime = departureTime;
			} else {
				throw new NullPointerException();
			}
		} else {
			throw new NullPointerException();
		}
	}

	
	public Date getArrivalTime() {
		return this.arrivalTime;
	}

	
	public void setArrivalTime(final Date arrivalTime) {
		// Check if the new the departure time is not null;
		if (arrivalTime != null) {
			// If an departure time is not set, accept the new arrival time.
			// Or if an departure time is set, accept the new arrival time only
			// if it is after the the departure time.
			if ((this.getDepartureTime() == null)
					|| arrivalTime.after(this.getDepartureTime())) {
				this.arrivalTime = arrivalTime;
			} else {
				throw new NullPointerException();
			}
		} else {
			throw new NullPointerException();
		}
	}

	
	public long getValidityPeriod() {
		return this.validityPeriod;
	}

	
	public void setValidityPeriod(final long validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	
	public Airport getDepartureAirport() {
		return this.departureAirport;
	}

	
	public void setDepartureAirport(final Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	
	public Airport getArrivalAirport() {
		return this.arrivalAirport;
	}

	
	public void setArrivalAirport(final Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	
	public Integer getFlightNumber() {
		return this.flightNumber;
	}

	
	public void setFlightNumber(final Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	
	public List<StopoverInfo> getStopovers() {
		return Collections.unmodifiableList(this.stopovers);
	}

	
	public void addStopover(final StopoverInfo stopover) {
		
		if (((stopover.getDepartureTime() != null) && (stopover
				.getDepartureTime().getTime() < this.getArrivalTime().getTime()))
				&& ((stopover.getArrivalTime() != null) && (stopover
						.getArrivalTime().getTime() > this.getDepartureTime()
						.getTime()))) {
			this.stopovers.add(stopover);

		} else {
			throw new IllegalArgumentException();
		}
	}

	
	public void removeStopover(final StopoverInfo stopover) {
		this.stopovers.remove(stopover);
	}

	
	public void clearStopovers() {
		this.stopovers.clear();
	}

	
	public long getLength() {
		if ((this.getArrivalTime() != null)
				&& (this.getDepartureTime() != null)) {
			return this.getArrivalTime().getTime()
					- this.getDepartureTime().getTime();
		} else {
			throw new NullPointerException();
		}
	}
}
