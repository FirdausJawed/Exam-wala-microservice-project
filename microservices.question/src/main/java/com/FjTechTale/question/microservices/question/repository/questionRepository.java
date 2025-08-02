package com.FjTechTale.question.microservices.question.repository;

import com.FjTechTale.question.microservices.question.entity.question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface questionRepository extends JpaRepository<question, Long> {
    List<question> findByQuizId(Long quizId);
}
