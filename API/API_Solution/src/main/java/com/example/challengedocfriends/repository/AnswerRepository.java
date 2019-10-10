package com.example.challengedocfriends.repository;

import com.example.challengedocfriends.model.entity.Answer;
import com.example.challengedocfriends.model.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findByQuestion(Question question);
}
