//package com.example.challengedocfriends.repository;
//
//import com.example.challengedocfriends.ChallengeDocfriendsApplicationTests;
//import com.example.challengedocfriends.model.entity.QuestionTagGroup;
//import org.junit.Assert;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//public class QuestionTagGroupRepositoryTest extends ChallengeDocfriendsApplicationTests {
//
//    @Autowired
//    private QuestionTagGroupRepository questionTagGroupRepository;
//
//    @Autowired
//    private QuestionRepository questionRepository;
//
//
//    @Test
//    @Transactional
//    public void read(){
//        List<QuestionTagGroup> questionTagGroupList = questionTagGroupRepository.findByQuestion(questionRepository.getOne(2l));
//
//        Assert.assertNotNull(questionTagGroupList);
//
//        System.out.println(questionTagGroupList.size());
//    }
//}
