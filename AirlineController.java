package com.booking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.booking.Entity.Airline;
import com.booking.Entity.Airport;
import com.booking.Service.AirlineService;

@RestController
public class AirlineController {
	
	@Autowired
	AirlineService airlineService;
	

	@PostMapping("/AddAirline")
	public String addAirline(@RequestBody Airline airline) {
		
		String str=airlineService.addAirline(airline);
		
		return str;
	  }
	
	@PostMapping("/AddAirport")
	public String addAirport(@RequestBody Airport airport) {
		
		String str=airlineService.addAirport(airport);
		
		return str;
	  }
}
