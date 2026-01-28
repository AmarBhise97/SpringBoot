package com.flipcart.FlipcartService.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/User")
public class Usercontroller {
	
	@Autowired
	private Car car;
	
	static int counter=1;
	@GetMapping("/created")
	public int[] createOrder() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println(counter++);
		return new int[] {1,2,7,8,9,7,7,6,6,3,4};
	}
	@GetMapping("/id")
	public String getID() {
		return car.getid();
	}
}
