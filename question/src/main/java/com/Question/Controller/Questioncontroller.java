package com.Question.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Question.Entity.Questions;
import com.Question.Service.QuestionService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/question")
public class Questioncontroller {
	
	private QuestionService service;
	
	public Questioncontroller(QuestionService service) {
		this.service=service;
	}
	
	@PostMapping
	public Questions addquestion(@RequestBody Questions question) {
		return service.addQuestion(question);
	}
	@GetMapping
	public List<Questions> getallquestion(){
		return service.getQuestion();
	}
	
	@GetMapping("/{id}")
	public Questions getbyquestionid(@PathVariable int id) {
		return service.getbyid(id);
	}

}
