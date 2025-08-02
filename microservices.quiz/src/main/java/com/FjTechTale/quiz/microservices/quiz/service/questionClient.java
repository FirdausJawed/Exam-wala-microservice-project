package com.FjTechTale.quiz.microservices.quiz.service;

import com.FjTechTale.quiz.microservices.quiz.entity.question;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082", value = "question-Client")
public interface questionClient {
    @GetMapping("/question/quiz/{quizId}")
    List<question>  getQuestionOfQuiz(@PathVariable  Long quizId);
}
