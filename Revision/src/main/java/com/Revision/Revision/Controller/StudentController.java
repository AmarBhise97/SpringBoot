package com.Revision.Revision.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Revision.Revision.Dto.StudentDto;
import com.Revision.Revision.Entity.Student;
import com.Revision.Revision.Service.StudentService;

@RestController
public class StudentController {
	
	private StudentService service;
	
	public StudentController(StudentService service) {
		
		this.service=service;
	}
	@PostMapping("addstudent")
	public Student addstudent(@RequestBody Student student) {
		return service.Addstudent(student);
	}
	
	@GetMapping("getstudents")
	public List<StudentDto> getStudent(@RequestParam(value="num")int num,@RequestParam(value="size")int size){
		return service.getStudent(num, size);
		
	}
	@GetMapping("getallstudent")
	public List<StudentDto> getallstudent(@RequestParam(value="num")int num,@RequestParam(value="size")int size,@RequestParam(value="field")String field,@RequestParam(value="direction")String direction){  
		return service.getallstudent(num, size, field, direction);
		
	}

}
