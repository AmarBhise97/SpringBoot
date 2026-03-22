package com.Quiz.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Quiz.Entity.Quiz;
import com.Quiz.Repository.QuizRepo;

@Service
public class QuizService {
	
	private QuizRepo repo;

	public QuizService(QuizRepo repo) {
		this.repo = repo;
	}
	
	public Quiz add_quiz(Quiz quiz) {
	 return	repo.save(quiz);
		
	}
	
	public List<Quiz> get_quiz() {
		
		return repo.findAll();
	}
	
	public Quiz getbyquizid(int id) {
		
		return repo.findById(id).get();
	}
	
	

}
