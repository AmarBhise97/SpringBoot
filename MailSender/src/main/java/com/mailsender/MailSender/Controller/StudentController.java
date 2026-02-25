package com.mailsender.MailSender.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mailsender.MailSender.Entity.Student;
import com.mailsender.MailSender.Service.Mailsender;
import com.mailsender.MailSender.Service.StudentService;

import jakarta.mail.MessagingException;




@RestController
public class StudentController {
	
	@Autowired
	private StudentService  service;
	
	@Autowired
	private Mailsender send;
	
	
	@PostMapping("/addstud")
	public Student addseud(@RequestBody Student student) {
		for(int i=0;i<10;i++) {
		send.sendermessage(student.getEmail());
		}
		return service.addstud(student);
	}
	
	@GetMapping("/getstudent")
	public List<Student> getstud(){
		return service.getstud();
	}
	@PostMapping("/addstudent")
	public Student addstudent(@RequestBody Student student) throws MessagingException {
	
		send.sendermimimessage(student);
		
		return service.addstud(student);
	}
	
	
}
