//package com.example.challengedocfriends.repository;
//
//import com.example.challengedocfriends.ChallengeDocfriendsApplicationTests;
//import com.example.challengedocfriends.model.entity.Tag;
//import org.junit.Assert;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//
//public class TagRepositoryTest extends ChallengeDocfriendsApplicationTests {
//
//    @Autowired
//    private TagRepository tagRepository;
//
//    @Test
//    @Transactional
//    public void create(){
//        Tag tag = Tag.builder()
//                .name("#한방재활의학과")
//                .build();
//
//        Tag newTag = tagRepository.save(tag);
//
//        Assert.assertNotNull(newTag);
//    }
//}
