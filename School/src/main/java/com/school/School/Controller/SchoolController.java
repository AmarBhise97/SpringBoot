package com.school.School.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.School.Entity.School;
import com.school.School.Exception.schoolnotfoundexception;
import com.school.School.Service.Schoolservice;

@RestController
@RequestMapping("/schoolController")
public class SchoolController {
	
	
	@Autowired
	 private Schoolservice schoolser;
	
	@PostMapping("/addall")
	public School addall(@RequestBody School school) throws Exception {
		
		return schoolser.addschool(school);
		
	}
	
	@GetMapping("/getbyid/{id}")
	public School getbyid(@PathVariable ("id")int id) throws Exception {
		return schoolser.getid(id);
	}
	
	@GetMapping("/getall")
	public List<School> getall() throws schoolnotfoundexception{
		return schoolser.getall();
	}

}
