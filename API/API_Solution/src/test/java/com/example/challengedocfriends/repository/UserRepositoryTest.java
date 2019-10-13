//package com.example.challengedocfriends.repository;
//
//import com.example.challengedocfriends.ChallengeDocfriendsApplicationTests;
//import com.example.challengedocfriends.model.entity.User;
//import org.junit.Assert;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//
//public class UserRepositoryTest extends ChallengeDocfriendsApplicationTests {
//
//    @Autowired
//    private UserRepository userRepository;
//
//
//    @Test
//    @Transactional
//    public void create(){
//        User user = User.builder()
//                .email("user03@gmail.com")
//                .password("3333")
//                .location("울산")
//                .age(23)
//                .gender("female")
//                .build();
//
//        User newUser = userRepository.save(user);
//
//        Assert.assertNotNull(newUser);
//    }
//
//}
