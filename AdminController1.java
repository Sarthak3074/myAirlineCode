package com.booking.Controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.booking.Entity.AdminEntity;
import com.booking.Entity.Airline;
import com.booking.Entity.Airport;
import com.booking.Service.AdminService;
import com.booking.Service.UserDetailsImpl;

import jwt.JwtUtils;

@RestController
public class AdminController1 {

	@Autowired
	AdminService adminService;

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtUtils jwtUtils;

	@PostMapping("/RegisterAdmin")
	public String addAdmin(@RequestBody AdminEntity admin) {

		String str = adminService.addAdmin(admin);

		return str;

	}

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginEntity loginRequest) {
		org.springframework.security.core.Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getLoginID(), loginRequest.getLoginPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);

		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

		List<String> roles = ((org.springframework.security.core.Authentication) userDetails).getAuthorities().stream()
				.map(item -> item.getAuthority()).collect(Collectors.toList());
		return (ResponseEntity<?>) ResponseEntity.ok();

	}

	@GetMapping("/getAllAdmin")
	public List<AdminEntity> listOfAdmin() {
		List<AdminEntity> list = adminService.listOfAdmin();
		return list;
	}

	@GetMapping("/getAllAirlines")
	public List<Airline> showAirline() {

		List<Airline> list = adminService.showAirline();

		return list;

	}

	@PostMapping("/Update&ManageAirlines")
	public String updateAirline(@RequestBody Airline airline) {

		String str = adminService.updateAirline(airline);

		return str;
	}

	@DeleteMapping("/deleteAirline/{airline_name}")
	public String deleteAirline(@PathVariable String airline_name) {

		String str = adminService.deleteAirline(airline_name);

		return str;
	}

	@GetMapping("/GetAllAirportInfo")
	public List<Airport> getAllAirport() {

		List<Airport> list = adminService.getAllAirport();

		return list;
	}
}
