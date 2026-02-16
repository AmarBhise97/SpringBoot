package com.tickitbooking.TickitBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tickitbooking.TickitBooking.Entity.Commuter;
import com.tickitbooking.TickitBooking.Repository.CommuterRepo;

@Service
public class CommuterService {
	
	@Autowired 
	private CommuterRepo repo;
	
	public ResponseEntity<Commuter> addCommuter(Commuter commuter) {
		
		return new ResponseEntity<Commuter>(repo.save(commuter),HttpStatus.CREATED);
	}
	
	public ResponseEntity<List<Commuter>> getCommuter(){
		return new ResponseEntity<List<Commuter>>(repo.findAll(),HttpStatus.FOUND);
	}

}
