package com.Fetch.FetchAPI.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Fetch.FetchAPI.Entity.Teacher;
import com.Fetch.FetchAPI.Repository.TeacherRepository;

@RestController
@RequestMapping("Teacher")
public class TeacherController {
	
	private TeacherRepository repo;
	
	
	public TeacherController(TeacherRepository repo) {
		
		this.repo=repo;
		
	}
	@PostMapping("addteacher")
	public Teacher addteacher(@RequestBody Teacher teacher) {
		return repo.save(teacher);
	}
	
	@GetMapping("getstudent")
	public List<Teacher> getteacher(){
		return repo.findAll();
	}

}
