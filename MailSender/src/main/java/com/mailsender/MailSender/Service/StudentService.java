package com.mailsender.MailSender.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mailsender.MailSender.Entity.Student;
import com.mailsender.MailSender.Repository.Studentrepo;



@Service
public class StudentService {
	
	@Autowired
	private Studentrepo repo;
	
	
	public Student addstud(Student student) {
		return repo.save(student);
	}
	
	
	public List<Student> getstud(){
		return repo.findAll();
	}
	

}
