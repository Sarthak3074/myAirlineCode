package com.booking.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TicketBooking {
	@Id
	private String PNR;
	private String userName;
	private String Source;
	private String Destination;
	private String Fair;

	@Override
	public String toString() {
		return "TicketBooking [PNR=" + PNR + ", userName=" + userName + ", Source=" + Source + ", Destination="
				+ Destination + ", Fair=" + Fair + "]";
	}

	public String getPNR() {
		return PNR;
	}

	public void setPNR(String pNR) {
		PNR = pNR;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public TicketBooking(String pNR, String userName, String source, String destination, String fair) {
		super();
		PNR = pNR;
		this.userName = userName;
		Source = source;
		Destination = destination;
		Fair = fair;
	}

	public TicketBooking() {
		super();
	}
}
