package com.school.School.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.School.Entity.Student;
import com.school.School.Repository.StudentRepository;



@Service
public class StudentService {
	
	
	@Autowired
	 private StudentRepository studentrepo ;
	
	
	public Student addstudent(Student student) throws Exception {
		if(student.getStudentname().isBlank()) {
			throw new Exception("Name is blank.....");
		}
		else if(!student .getStudentmatks().endsWith("%")) {
			throw new Exception("please enter in persentage....");
		}
		return studentrepo.save(student);
	}
	
	public List<Student> getallstudent(){
		
		return studentrepo.findAll();
	}
	
	
	
	 
	

}
