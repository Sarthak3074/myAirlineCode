package com.booking.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.booking.Entity.AdminEntity;
import com.booking.Entity.Airline;
import com.booking.Entity.Airport;

@Repository
public class AdminDao {

	@Autowired
	SessionFactory sessionFactory;

	public String addAdmin(AdminEntity admin) {
		
        Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
          int no = (int) session.save(admin);
		  transaction.commit();
          if(no>0) {
			  return "successfully updated";
			  } 
		   else {
			  return "something wrong";
		     }
         }     
	
	public List<AdminEntity> listOfAdmin(){
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<AdminEntity> list=session.createCriteria(AdminEntity.class).list();
		return list;
	   }

	
	public List<Airline> showAirline(){
	    Session session=sessionFactory.openSession();
		List<Airline> list= session.createCriteria(Airline.class).list();
		return list;
		}
	
	public String updateAirline(Airline airline) {
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.saveOrUpdate(airline);
		transaction.commit();
		return "Airline ==>"+airline.getAirline_name()+" Updated Successfully";
		
	   }
	
	public String deleteAirline(String airline_name) {
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
	    Criteria criteria=session.createCriteria(Airline.class);
	    criteria.add(Restrictions.eq("airline_name", airline_name));
	    Airline a=(Airline)criteria.uniqueResult();
	    session.delete(a);
	    transaction.commit();
		return "Airline => "+airline_name+" is Deleted Successfully";
		
	  }
	
	 public List<Airport> getAllAirport(){
		 Session session=sessionFactory.openSession();
		   List<Airport> list=session.createCriteria(Airport.class).list();
		   return list;
		 
	 }	
}
