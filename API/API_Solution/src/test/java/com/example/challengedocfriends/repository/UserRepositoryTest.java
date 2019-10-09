package com.example.challengedocfriends.repository;

import com.example.challengedocfriends.ChallengeDocfriendsApplicationTests;
import com.example.challengedocfriends.model.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryTest extends ChallengeDocfriendsApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        User user = User.builder()
                .email("user01@gmail.com")
                .build();

        User newUser = userRepository.save(user);

        Assert.assertNotNull(newUser);
    }

}
