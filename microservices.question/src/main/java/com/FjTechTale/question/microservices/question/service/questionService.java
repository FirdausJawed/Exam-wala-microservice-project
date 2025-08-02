package com.FjTechTale.question.microservices.question.service;

import com.FjTechTale.question.microservices.question.entity.question;
import org.springframework.stereotype.Service;

import java.util.List;
public interface  questionService {
    question create(question question);
    question findById(Long id);
    List<question> findAll();
    List<question> findByQuizId(Long quizId);
}
