package com.Question.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Question.Entity.Questions;
import com.Question.Repository.QuestionRepo;

@Service
public class QuestionService {

	private QuestionRepo repo;

	public QuestionService(QuestionRepo repo) {
		this.repo = repo;
	}

	public Questions addQuestion(Questions question) {
		return repo.save(question);
	}

	public List<Questions> getQuestion() {
		return repo.findAll();
	}

	public Questions getbyid(int id) {
		return repo.findById(id).get();
	}
}
