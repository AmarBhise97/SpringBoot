package com.tickitbooking.TickitBooking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tickitbooking.TickitBooking.Entity.Coupen;
import com.tickitbooking.TickitBooking.Repository.Coupenrepo;

@Service 
public class CoupenService {

	
	@Autowired
	public Coupenrepo repo;
	
	
	public Coupen addcoupen(Coupen coupen) {
		return repo.save(coupen);
	}
		
		
	
}
