package com.amazon.AmazonService.entity;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/usss")
public class UserController {
	
	User user =new User();
	@GetMapping("/uss")
	public String getuser() {
		user.mobile="Xiaomi 12 ";
		user.name="Amar ";
		return user.toString();
	}
	@PostMapping("/add")
	public String add( @RequestParam String name) {
		System.out.println(name.toUpperCase());
		return "name Added ::"+name;
			
	}@PostMapping("/addname")
	public String addname( @RequestParam Integer[]name) {
		List<Integer> list= Arrays.asList(name);
		int sum = list.stream().reduce(0,(i,j)->(i+j));
		return Integer.valueOf(sum).toString();
	}
	@PostMapping("/addnumber")
	public Integer addnumber(@RequestParam (required=false) Integer []num) {
		List<Integer> list1 = Arrays.asList(2,2,2);
		int sum1 = list1.stream().reduce(1, (i,j)->(i*j));
		return sum1 ;
	}
	
	

}

class User{
	String name;
	String mobile;
	
	public String toString() {
		return this.name+this.mobile;
		
	}
	
}
