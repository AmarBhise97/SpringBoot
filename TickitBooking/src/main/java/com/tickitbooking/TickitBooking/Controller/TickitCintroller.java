package com.tickitbooking.TickitBooking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tickitbooking.TickitBooking.Entity.Tickit;
import com.tickitbooking.TickitBooking.Service.Tickitservice;

@RestController
public class TickitCintroller {
	
	@Autowired
	private Tickitservice service;
	
	@PostMapping("/addtickit")
	public Tickit addTickit(@RequestBody Tickit tickit) throws Exception {
		
		return service.addTickit(tickit);
		
	}
	@GetMapping("/gettickit")
	public List<Tickit> ggetTickit(){
		return service.gettickit();
	}
}