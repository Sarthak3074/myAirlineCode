package com.booking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.booking.Dao.AirlineDao;
import com.booking.Entity.Airline;
import com.booking.Entity.Airport;

@Service
public class AirlineService {
	
	@Autowired
	AirlineDao airlineDao;

	public String addAirline(Airline airline) {
		
		String str=airlineDao.addAirline(airline);
		
		return str;
	  }
	
	public String addAirport(Airport airport) {
		
		String str=airlineDao.addAirport(airport);
		
		return str;
	}
}
