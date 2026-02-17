package com.tickitbooking.TickitBooking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tickitbooking.TickitBooking.Entity.Coupen;
import com.tickitbooking.TickitBooking.Service.CoupenService;

@RestController 
public class CoupenController {
	
	@Autowired
	private CoupenService service;
	

	@PostMapping("/addcoupen")
	public Coupen addcoupen(@RequestBody Coupen coupen) {
		return service.addcoupen(coupen);
	}
}
