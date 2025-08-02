package com.FjTechTale.quiz.microservices.quiz.repository;

import com.FjTechTale.quiz.microservices.quiz.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface quizRepository extends JpaRepository<Quiz, Long> {

}
