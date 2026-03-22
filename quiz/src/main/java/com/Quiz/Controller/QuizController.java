package com.Quiz.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Quiz.Entity.Quiz;
import com.Quiz.Service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	private QuizService service;

	public QuizController(QuizService service) {
		super();
		this.service = service;
	}
	
	  @PostMapping
	  public Quiz add_quiz(@RequestBody Quiz quiz) {
		  
		  return service.add_quiz(quiz);
	  }
	  
	  @GetMapping
	    public List<Quiz> get_quiz(){
	        return service.get_quiz();
	    }

	    @GetMapping("/{id}")
	    public Quiz getquizbyid(@PathVariable int id){
	        return service.getbyquizid(id);
	    }

	}


