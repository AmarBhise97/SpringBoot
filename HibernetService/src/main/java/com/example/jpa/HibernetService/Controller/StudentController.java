package com.example.jpa.HibernetService.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.HibernetService.Entity.Student;

@RestController
public class StudentController {
	
	@PostMapping("/add")
	public Student add(@RequestBody Student student) {
		student.setId(student.getId());
		student.setName(student.getName());
		student.setAddress(student.getAddress());
		return student;
	}
	

}
