package com.Quiz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Quiz.Entity.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz , Integer> {

}
