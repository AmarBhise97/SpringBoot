package com.Quiz.Service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="http://localhost:9091",value="Question-clint")
public interface Question {
	
	@GetMapping("question/quize/{quizeid}")
	List<Question> getQuestionQueiz(@PathVariable int quizeid);

}
