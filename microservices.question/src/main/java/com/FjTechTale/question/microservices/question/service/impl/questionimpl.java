package com.FjTechTale.question.microservices.question.service.impl;

import com.FjTechTale.question.microservices.question.entity.question;
import com.FjTechTale.question.microservices.question.repository.questionRepository;
import com.FjTechTale.question.microservices.question.service.questionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class questionimpl implements questionService {

    questionRepository qr;
    public questionimpl(questionRepository qr) {
        this.qr = qr;
    }

    @Override
    public question create(question question) {
        return qr.save(question);
    }

    @Override
    public question findById(Long id) {
        return qr.findById(id)
                .orElseThrow(() -> new RuntimeException("Question not found with id: " + id));
    }

    @Override
    public List<question> findAll() {
        return qr.findAll();
    }

    @Override
    public List<question> findByQuizId(Long quizId) {
        return qr.findByQuizId(quizId);
    }
}
