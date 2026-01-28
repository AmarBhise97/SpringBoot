package com.flipcart.FlipcartService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipcart.FlipcartService.Entity.Car;

@RestController

public class carController {
	@Autowired
	private Car car;
	@GetMapping("/id")
	public String getID() {
		return car.getid();
	}
	

}
