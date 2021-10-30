package com.booking.Controller;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.Entity.Airline;
import com.booking.Service.AdminService;

@RestController
@RequestMapping("/api/v1.0/flight/users")
public class UserController {	
	
	@Autowired
	AdminService adminService;
		
		@GetMapping("/booking/{flight_no}")
		public ResponseEntity<?> bookFlight(@RequestBody Object TicketBooking , @PathVariable Long flightNo){
			
			return null;
			
		}
		//GET /api/v1.0/flight/booking/history/{emailId} Get Booked tickets history based on Email ID
		@GetMapping("/booking/history/{emailId}")
		public ResponseEntity<?> myBookingHistory(@PathVariable @Email String emailId){
			
			return null;
			
		}
		//GET /api/v1.0/flight/ticket/{pnr} Get Booked ticket details based on PNR
		@GetMapping("/booking/ticket/{PNR}")
		public ResponseEntity<?> retriveBookingDetails(@PathVariable String pnr){
			
			return null;
			
		}
		//DELETE /api/v1.0/flight/booking/cancel/{pnr}
		@DeleteMapping("/booking/cancel/{PNR}")
		public ResponseEntity<?> cancelBooking(@PathVariable String pnr){
			
			return null;
			
		}
		@GetMapping("/getAllAirlines")
		public List<Airline> showAirline(){
			
			List<Airline> list=adminService.showAirline();
			
			return list;
			
		}
}