package com.tickitbooking.TickitBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tickitbooking.TickitBooking.Entity.Commuter;

@Repository
public interface CommuterRepo extends JpaRepository<Commuter, Integer> {
	
	

}
