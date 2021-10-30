package com.booking.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airport implements Serializable{
	
	@Id
	private int airport_code;
	private String airport_location;
	private String airport_name;
	
	public Airport() {
		super();
		}

	public Airport(int airport_code, String airport_location, String airport_name) {
		super();
		this.airport_code = airport_code;
		this.airport_location = airport_location;
		this.airport_name = airport_name;
	}

	public int getAirport_code() {
		return airport_code;
	}

	public void setAirport_code(int airport_code) {
		this.airport_code = airport_code;
	}

	public String getAirport_location() {
		return airport_location;
	}

	public void setAirport_location(String airport_location) {
		this.airport_location = airport_location;
	}

	public String getAirport_name() {
		return airport_name;
	}

	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}

	@Override
	public String toString() {
		return "Airport [airport_code=" + airport_code + ", airport_location=" + airport_location + ", airport_name="
				+ airport_name + "]";
	}
	
	

}
