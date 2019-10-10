package com.example.challengedocfriends.repository;

import com.example.challengedocfriends.ChallengeDocfriendsApplicationTests;
import com.example.challengedocfriends.model.entity.Answer;
import com.example.challengedocfriends.model.entity.Question;
import com.example.challengedocfriends.model.entity.QuestionTagGroup;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public class QuestionRepositoryTest extends ChallengeDocfriendsApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuestionTagGroupRepository questionTagGroupRepository;

    @Autowired
    private AnswerRepository answerRepository;


    @Test
    public void create(){
        Question question = Question.builder()
                .title("여드름, 사용하던 선크림이 단종돼서 다른걸")
                .content("선크림 영향인지 모르겠지만 최근 어쩔 수 없이")
                .createdAt(LocalDate.now())
                .createdBy("Admin")
                .user(userRepository.getOne(3L))
                .build();

        Question newQuestion = questionRepository.save(question);

        Assert.assertNotNull(newQuestion);
    }

    @Test
    public void read(){
        List<Question> questionList = questionRepository.findAll();

        Assert.assertNotNull(questionList);
    }

    @Test
    public void getAnswerCount(){
        Question question = questionRepository.getOne(2L);

        Assert.assertNotNull(question);

        List<Answer> answerList = answerRepository.findByQuestion(question);

        System.out.println(answerList.size());
    }
}
