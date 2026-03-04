package com.OTPsender.Otpsender.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OTPsender.Otpsender.Entity.Student;
import com.OTPsender.Otpsender.Service.StudentService;

@RestController
public class StudentController {
   
	 public StudentService service;
	 
	 public StudentController(StudentService service) {
		 this.service=service;
	 }
	 
	 
	 @PostMapping("/addstudent")
	 public Student add(@RequestBody Student student) {
		 return service.addstudent(student);
	 }
	 
	 @GetMapping("/getstudent")
	 public List<Student> get(){
		 return service.getStudent();
	 }
}
