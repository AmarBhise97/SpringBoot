package com.school.School.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.School.Entity.Student;
import com.school.School.Service.StudentService;



@RestController
@RequestMapping("/studentcontroller")
public class StudentController {
	
	@Autowired
	private StudentService studentser;
	
	
	@PostMapping("addallstudent")
	public  Student addallstudent(@RequestBody Student student) throws Exception {
		
		return studentser.addstudent(student);
	}
	
	@GetMapping("/getallstudent")
	public List<Student> getallstud(){
		
		return studentser.getallstudent();
	}
	
	

}
