package com.student.Studentmanagment.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * using @RequestParam............
 * using Required=false
 */
@RestController
@RequestMapping("/student")
public class StudentCalculation {
	StudentInfo std =new StudentInfo();
	@GetMapping("/add")
	public String add() {
		std.id=12;
		std.name=" Amar ";
		std.Class=" BCA TY: A ";
		std.marks=88.60;
		return std.toString();
		
		
	}
	@PostMapping("/add2")
	public String add2( @RequestParam(required = false) String str) {
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.hashCode());
		System.out.println(str.hashCode());
		std.id=12;
		std.name=" Amar ";
		std.Class=" BCA TY: A ";
		std.marks=88.60;
		return "Name :" +str;
	}
	@PostMapping("/addd")
	public int[] addd(@RequestParam Integer[] arr){
		return new int[] {1,2,3,4,5};
	}

}
class StudentInfo{
	int id;
	String name;
	String Class;
	double marks;
	
	public String toString() {
		
		return this.id+this.name+this.Class+this.marks;
	}
	
}

