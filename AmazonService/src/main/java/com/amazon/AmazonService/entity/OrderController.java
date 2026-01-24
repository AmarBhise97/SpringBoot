package com.amazon.AmazonService.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class OrderController {
	
	static int counter=1;
	@GetMapping("/created")
	public int[] createOrder() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println(counter++);
		return new int[] {1,2,7,8,9,7,7,6,6,3,4};
	}

}
