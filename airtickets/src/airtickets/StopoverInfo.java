package airtickets;

import java.util.Date;


final public class StopoverInfo {
	private Date departureTime = null;
	private Date arrivalTime = null;
	private Airport airport = null;

	
	public StopoverInfo() {
	}

	
	public StopoverInfo(final Date departureTime, final Date arrivalTime,
			final Airport airport) {
		this.setDepartureTime(departureTime);
		this.setArrivalTime(arrivalTime);
		this.setAirport(airport);
	}

	
	public Airport getAirport() {
		return this.airport;
	}

	
	public void setAirport(final Airport airport) {
		this.airport = airport;
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

	
	public Date getDepartureTime() {
		return this.departureTime;
	}

	
	public void setDepartureTime(final Date departureTime) {
		
		if (departureTime != null) {
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

	
	public long length() {
		return this.arrivalTime.getTime() - this.departureTime.getTime();
	}

	
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof StopoverInfo) {
			final StopoverInfo other = (StopoverInfo) obj;
			return (other.getDepartureTime() == this.getDepartureTime())
					&& (other.getArrivalTime() == this.getArrivalTime())
					&& (other.getAirport() == this.getAirport());

		} else {
			return false;
		}

	}
}
