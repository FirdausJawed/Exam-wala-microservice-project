package com.FjTechTale.question.microservices.question.controller;

import com.FjTechTale.question.microservices.question.entity.question;
import com.FjTechTale.question.microservices.question.service.questionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class questionController {
    private final questionService service;
    public questionController(questionService service) {
        this.service = service;
    }

    //create question
    @PostMapping
    public void createQuestion(@RequestBody question question) {
        service.create(question);
    }

    //get all questions
    @GetMapping
    public List<question> getAllQuestions() {
        return service.findAll();
    }

    //find by id
    @GetMapping("/{id}")
    public question findById(@PathVariable Long id) {
        return service.findById(id);
    }

    //find by quiz id
    @GetMapping("/quiz/{quizId}")
    public List<question> findByQuizId(@PathVariable Long quizId) {
        return service.findByQuizId(quizId);
    }
}
