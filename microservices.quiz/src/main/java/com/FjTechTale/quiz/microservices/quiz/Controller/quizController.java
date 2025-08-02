package com.FjTechTale.quiz.microservices.quiz.Controller;

import com.FjTechTale.quiz.microservices.quiz.entity.Quiz;
import com.FjTechTale.quiz.microservices.quiz.service.quizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class quizController {
    quizService service;
    public quizController(quizService service) {
        this.service = service;
    }

    //create
    @PostMapping
    public Quiz add(@RequestBody Quiz quiz) {
        return service.add(quiz);
    }

    //find all
    @GetMapping
    public List<Quiz> findAll() {
        return service.findAllQuiz();
    }

    //find by id
    @GetMapping("/{id}")
    public Quiz findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
