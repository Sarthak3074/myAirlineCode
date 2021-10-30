package com.booking.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.booking.Entity.TicketBooking;

@Repository
public interface TicketBookingDao  extends JpaRepository<TicketBooking, Long>{

}