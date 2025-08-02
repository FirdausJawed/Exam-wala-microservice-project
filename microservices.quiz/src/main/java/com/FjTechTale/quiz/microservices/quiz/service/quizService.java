package com.FjTechTale.quiz.microservices.quiz.service;
import com.FjTechTale.quiz.microservices.quiz.entity.Quiz;

import java.util.List;

public interface quizService {
    Quiz add(Quiz quiz);
    List<Quiz> findAllQuiz();
    Quiz findById(Long id);
}
