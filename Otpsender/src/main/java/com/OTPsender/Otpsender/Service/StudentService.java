package com.OTPsender.Otpsender.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.OTPsender.Otpsender.Entity.Student;
import com.OTPsender.Otpsender.Repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repo;
	
	public StudentService(StudentRepository repo) {
		this.repo=repo;
	}
	
	public Student addstudent(Student student) {
		 return repo.save(student);
	}
	
	public List<Student> getStudent(){
		return repo.findAll();
	}
}
