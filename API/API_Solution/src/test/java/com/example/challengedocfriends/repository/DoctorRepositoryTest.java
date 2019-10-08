package com.example.challengedocfriends.repository;

import com.example.challengedocfriends.ChallengeDocfriendsApplicationTests;
import com.example.challengedocfriends.model.entity.Doctor;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DoctorRepositoryTest extends ChallengeDocfriendsApplicationTests {

    @Autowired
    private DoctorRepository doctorRepository;

    @Test
    public void create(){
        Doctor doctor = Doctor.builder()
                .name("정동원")
                .build();

        Doctor newDoctor = doctorRepository.save(doctor);
        Assert.assertNotNull(newDoctor);
    }
}
