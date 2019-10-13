//package com.example.challengedocfriends.repository;
//
//import com.example.challengedocfriends.ChallengeDocfriendsApplicationTests;
//import com.example.challengedocfriends.model.entity.QuestionTagGroup;
//import org.junit.Assert;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//
//public class QuestionTagGroupTest extends ChallengeDocfriendsApplicationTests {
//
//    @Autowired
//    private QuestionTagGroupRepository questionTagGroupRepository;
//
//    @Autowired
//    private TagRepository tagRepository;
//
//    @Autowired
//    private QuestionRepository questionRepository;
//
//
//    @Test
//    @Transactional
//    public void create(){
//        QuestionTagGroup questionTagGroup = QuestionTagGroup.builder()
//                .tag(tagRepository.getOne(1L))
//                .question(questionRepository.getOne(2L))
//                .build();
//
//        QuestionTagGroup newQuestionTagGroup = questionTagGroupRepository.save(questionTagGroup);
//
//        Assert.assertNotNull(newQuestionTagGroup);
//    }
//}
