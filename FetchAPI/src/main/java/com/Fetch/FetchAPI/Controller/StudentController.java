package com.Fetch.FetchAPI.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Fetch.FetchAPI.Entity.Student;
import com.Fetch.FetchAPI.Repository.StudentRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("student")
public class StudentController {
	
	private StudentRepository repo;
	
	public StudentController(StudentRepository repo) {
		this.repo=repo;
	}
	
	@PostMapping("addstudent")
	public Student addstudent(@RequestBody Student student) {
         return repo.save(student);
	}
	
	@GetMapping("getstudent")
	public List<Student> getstudent() throws InterruptedException{
		Thread.sleep(5000);
		return repo.findAll();
	}

}
