package com.booking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.booking.Dao.AdminDao;
import com.booking.Entity.AdminEntity;
import com.booking.Entity.Airline;
import com.booking.Entity.Airport;

@Service
public class AdminService {
	
	@Autowired
	AdminDao dao;

	 public String addAdmin(AdminEntity admin) {
		 
		 String str=dao.addAdmin(admin);
		 
		 return str;
		 
	 }
	 
	 public List<AdminEntity> listOfAdmin(){
		 
		 List<AdminEntity> list=dao.listOfAdmin();
		 
		 return list ;
	 }
	 
	 public List<Airline> showAirline(){
		 
		 List<Airline> list=dao.showAirline();
		 
		 return list;
		 
	 }
	 
	 public String updateAirline(Airline airline) {
		 
		String str= dao.updateAirline(airline);
		 
		 return str;
	 }

	 public String deleteAirline(String airline_name) {
		 
		 String str=dao.deleteAirline(airline_name);
		 
		 return str;
	 }
	 
	 public List<Airport> getAllAirport(){
		 
		   List<Airport> list=dao.getAllAirport();
		   
		   return list;
	 }

}
