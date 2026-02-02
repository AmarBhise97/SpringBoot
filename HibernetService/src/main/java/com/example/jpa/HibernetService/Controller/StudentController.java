package com.example.jpa.HibernetService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.HibernetService.Entity.Student;
import com.example.jpa.HibernetService.Repository.Student_repository;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private Student_repository repo;
	
	@PostMapping("/add")
	public Student add(@RequestBody Student student) {
		
		repo.save(student);
//		student.setId(student.getId());
//		student.setName(student.getName());
//		student.setAddress(student.getAddress());
		return student;
	}
	
	
	@GetMapping("/get")
	public List<Student> get(){
		
		return repo.findAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public Student getbyid(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}

}
