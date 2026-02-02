package com.Examanation.ExamanitionService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Examanation.ExamanitionService.ControllerRepository.Student_Info_repository;

import com.Examanation.ExamanitionService.Entity.Student_Info;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private Student_Info_repository repo;
	
	@PostMapping("/add")
	public Student_Info add(@RequestBody Student_Info student) {
		repo.save(student);
		return  student;
	}
	
	@GetMapping("/getall")
	public List<Student_Info> getAll(){
		return repo.findAll();
	}
	@GetMapping("/getbyid/{id}")
	public Student_Info getid(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	@DeleteMapping("deletebyid/{id}")
	public String deleteid(@PathVariable("id")int id) {
		 repo.deleteById(id);
		 return "Delete Successfully.....";
	}

}
