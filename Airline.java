package com.booking.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="airline")
@Entity
public class Airline implements Serializable {
	
	@Id
	private int flight_no;
	private String airline_name;
	private String flight_model ; 
	private String carrier_name;
	private String seat_capacity;
	
	public Airline() {
		super();}

	public Airline(int flight_no, String airline_name, String flight_model, String carrier_name, String seat_capacity) {
		super();
		this.flight_no = flight_no;
		this.airline_name = airline_name;
		this.flight_model = flight_model;
		this.carrier_name = carrier_name;
		this.seat_capacity = seat_capacity;
	}

	public int getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}

	public String getAirline_name() {
		return airline_name;
	}

	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}

	public String getFlight_model() {
		return flight_model;
	}

	public void setFlight_model(String flight_model) {
		this.flight_model = flight_model;
	}

	public String getCarrier_name() {
		return carrier_name;
	}

	public void setCarrier_name(String carrier_name) {
		this.carrier_name = carrier_name;
	}

	public String getSeat_capacity() {
		return seat_capacity;
	}

	public void setSeat_capacity(String seat_capacity) {
		this.seat_capacity = seat_capacity;
	}

	@Override
	public String toString() {
		return "Airline [flight_no=" + flight_no + ", airline_name=" + airline_name + ", flight_model=" + flight_model
				+ ", carrier_name=" + carrier_name + ", seat_capacity=" + seat_capacity + "]";
	}
		
	
	
	
	
	
	
}
