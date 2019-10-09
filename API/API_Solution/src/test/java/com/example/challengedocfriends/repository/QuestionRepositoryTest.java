package com.example.challengedocfriends.repository;

import com.example.challengedocfriends.ChallengeDocfriendsApplicationTests;
import com.example.challengedocfriends.model.entity.Question;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class QuestionRepositoryTest extends ChallengeDocfriendsApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        Question question = Question.builder()
                .title("여드름 걱정")
                .content("피부가 건성인데 여드름이 자주 생겨요.")
                .createdAt(LocalDate.now())
                .createdBy("Admin")
                .user(userRepository.getOne(1L))
                .build();

        Question newQuestion = questionRepository.save(question);

        Assert.assertNotNull(newQuestion);
    }
}
