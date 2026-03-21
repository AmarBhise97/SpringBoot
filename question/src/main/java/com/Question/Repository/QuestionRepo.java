package com.Question.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Question.Entity.Questions;

@Repository
public interface QuestionRepo extends JpaRepository<Questions, Integer> {

}
