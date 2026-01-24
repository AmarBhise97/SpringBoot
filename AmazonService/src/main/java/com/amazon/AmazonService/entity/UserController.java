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
	
			 
	}
	/**
	 * we can gices omly parameters and not any key or value 
	 * thats time 400 badrequest error
	 * @param name
	 * @return
	 */
	@PostMapping("/addname")
	public String addname( @RequestParam Integer[]name) {
		List<Integer> list= Arrays.asList(name);
		int sum = list.stream().reduce(0,(i,j)->(i+j));
		return Integer.valueOf(sum).toString();
	}
	
	/**
	 * we can use required = false than not mandatory request parameter
	 * 
	 * @param num
	 * @return
	 */
	@PostMapping("/addnumber")
	public Integer addnumber(@RequestParam (required=false) Integer []num) {
		List<Integer> list1 = Arrays.asList(2,2,2);
		int sum1 = list1.stream().reduce(1, (i,j)->(i*j));
		return sum1 ;
	}
	/**
	 * if not any key and value than sohwn Required parameter 'num' is not present.
	 * rerror ->400 bad request.
	 * @param num
	 * @return
	 */
	
	/**
	 * if we can use default value than not compulsory to use !(required = false)
	 * @param num
	 * @return
	 */
	@PostMapping("/adddefault")
	public Integer addtrue(@RequestParam(defaultValue="18") Integer []num) {
		List<Integer> list1 = Arrays.asList(2,2);
		int sum1 = list1.stream().reduce(1, (i,j)->(i*j));
		return sum1 ;
	}
	
	
	
	/**
	 * using get mapping 
	 * if we have not any key and values than shown error
	 * 400 badrequest.
	 * @param name
	 * @param mobile
	 * @return
	 */
	@GetMapping("/det")
	public String getDetails(@RequestParam String name,@RequestParam String mobile) {
		return user.name+user.mobile;
	}
	
	

}

class User{
	String name="Amar    ";
	String mobile="Xiomi";
	
	public String toString() {
		return this.name+this.mobile;
		
	}
	
}
