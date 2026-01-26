package com.student.Studentmanagment.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class Studentservice {
	Student st = new Student();
	@GetMapping("/Info")
	public String Info() {
		st.name="Amar";
		st.id=1234;
		st.marks=88.60;
		return st.toString();
	}
	@PostMapping("/Info2")
	public String Info2(@RequestParam (value="dd",required=true)String name) {
		name="Amar";
		return "name :"+name;
	}
	

}
class Student{
	String name;
	int id;
	double marks;
	 
	public String toString() {
		return this.name+this.id+this.marks;
	}
	
}
