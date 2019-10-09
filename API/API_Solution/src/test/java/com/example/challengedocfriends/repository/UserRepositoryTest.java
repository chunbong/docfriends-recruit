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
                .email("user02@gmail.com")
                .password("2222")
                .location("수원")
                .age(24)
                .gender("male")
                .build();

        User newUser = userRepository.save(user);

        Assert.assertNotNull(newUser);
    }

}
