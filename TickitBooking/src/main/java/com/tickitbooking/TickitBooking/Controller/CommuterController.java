package com.tickitbooking.TickitBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tickitbooking.TickitBooking.Entity.Commuter;
import com.tickitbooking.TickitBooking.Service.CommuterService;

import jakarta.validation.Valid;

@RestController
public class CommuterController {
	
	@Autowired
	private CommuterService service;
	@PostMapping("/add")
	public ResponseEntity<Commuter> addcomutter(@Valid @RequestBody Commuter commuter) {
		return service.addCommuter(commuter);
	}
	@GetMapping("/getcommuter")
	public ResponseEntity<List<Commuter>> getcommuter(){
		return service.getCommuter();
	}

}
