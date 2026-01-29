package com.flipcart.FlipcartService.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/User")
public class Usercontroller {
	
	@Autowired
	private Car car;
	
	
	
	@Autowired
	private Car1 car1;

	
	static int counter=1;
	@PostMapping("/created")
	public int[] createOrder(int arr[]) throws InterruptedException{
		Thread.sleep(1000);
		System.out.println(counter++);
		return arr;
	}
	@GetMapping("/id")
	public String getID() {
		return car.getid();
	}
	
	@GetMapping("/nn1")
	public String addname2(String name, int id ) {
	
		return car1.addname1(name, id);
	}
}
@RestController
@RequestMapping("/car1")
class Car1{
	String name;
	int id;
	
	public String toString() {
		return this.name+ " "+this.id;
	}
	@PostMapping("/nn")
	public String addname1(String name,int id) {
		
		return name+id;
	}
}
