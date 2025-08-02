package com.FjTechTale.quiz.microservices.quiz.service.impl;

import com.FjTechTale.quiz.microservices.quiz.entity.Quiz;
import com.FjTechTale.quiz.microservices.quiz.repository.quizRepository;
import com.FjTechTale.quiz.microservices.quiz.service.questionClient;
import com.FjTechTale.quiz.microservices.quiz.service.quizService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

@Service
public class quizServiceImpl implements quizService {
    private quizRepository qr;
    private questionClient qc;

    public quizServiceImpl(quizRepository qr, questionClient qc) {
        this.qr = qr;
        this.qc = qc;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return qr.save(quiz);
    }

    @Override
    public List<Quiz> findAllQuiz() {
        List<Quiz> quizzes = qr.findAll();
        List<Quiz> q = quizzes.stream().map(quiz->{
            try {
                quiz.setQuestions(qc.getQuestionOfQuiz(quiz.getId()));
            } catch (Exception e) {
                // If question service is not available, set empty list
                quiz.setQuestions(new ArrayList<>());
                System.err.println("Error fetching questions for quiz " + quiz.getId() + ": " + e.getMessage());
            }
            return quiz;
        }).collect(Collectors.toList());

        return q;
    }

    @Override
    public Quiz findById(Long id) {
        Quiz quiz = qr.findById(id)
                .orElseThrow(() -> new RuntimeException("Quiz not found with id: " + id));
        try {
            quiz.setQuestions(qc.getQuestionOfQuiz(quiz.getId()));
        } catch (Exception e) {
            // If question service is not available, set empty list
            quiz.setQuestions(new ArrayList<>());
            System.err.println("Error fetching questions for quiz " + quiz.getId() + ": " + e.getMessage());
        }
        return quiz;
    }
}
