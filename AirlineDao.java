package com.booking.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.booking.Entity.Airline;
import com.booking.Entity.Airport;

@Repository
public class AirlineDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public String addAirline(Airline airline) {
		    Session session=sessionFactory.openSession();
		    Transaction transaction =session.beginTransaction();
		    int no=(int)session.save(airline);
		    transaction.commit();
		    if(no>0) {
			   return "Airline added successfully";
		    }
		    else {
			   return "something gonna wrong";
		    }
		  }
	
	public String addAirport(Airport airport) {
		
		   Session session=sessionFactory.openSession();
		   Transaction transaction=session.beginTransaction();
		   int no=(int)session.save(airport);
		   transaction.commit();
		   if(no>0) {
			return "Airport Info Stored Successfully";
		   }
		   else {
			return "Something gonna wrong";
		   }
	     }

}
