//package com.example.challengedocfriends.repository;
//
//import com.example.challengedocfriends.ChallengeDocfriendsApplicationTests;
//import com.example.challengedocfriends.model.entity.Answer;
//import org.junit.Assert;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.time.LocalDate;
//
//public class AnswerRepositoryTest extends ChallengeDocfriendsApplicationTests {
//
//    @Autowired
//    private AnswerRepository answerRepository;
//
//    @Autowired
//    private DoctorRepository doctorRepository;
//
//    @Autowired
//    private QuestionRepository questionRepository;
//
//    @Test
//    @Transactional
//    public void create(){
//        Answer answer = Answer.builder()
//                .title("안녕하세요. 정동원 입니다.")
//                .content("피부가 건조하면 모공의 입구가 잘 막히게 됩니다.")
//                .createdAt(LocalDate.now())
//                .createdBy("Admin")
//                .doctor(doctorRepository.getOne(1L))
//                .question(questionRepository.getOne(2L))
//                .build();
//
//        Answer newAnswer = answerRepository.save(answer);
//        Assert.assertNotNull(newAnswer);
//    }
//}
