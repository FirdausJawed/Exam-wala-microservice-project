package com.FjTechTale.quiz.microservices.quiz.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class question {
    private Long id;
    private  String question;
    private Long quizId;
}
