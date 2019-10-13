package com.example.challengedocfriends.service;

import com.example.challengedocfriends.model.entity.Answer;
import com.example.challengedocfriends.model.entity.Question;
import com.example.challengedocfriends.model.network.response.AnswerApiResponse;
import com.example.challengedocfriends.model.network.response.ConsultDetailApiResponse;
import com.example.challengedocfriends.model.network.response.QuestionApiResponse;
import com.example.challengedocfriends.repository.AnswerRepository;
import com.example.challengedocfriends.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ConsultDetailApiLogicService extends MainApiLogicService {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionRepository questionRepository;


    public ConsultDetailApiResponse read(Long id){
        Optional<Question> question = questionRepository.findById(id);
        QuestionApiResponse questionApiResponse = null;
        List<Answer> answerList = new ArrayList<>();
        List<AnswerApiResponse> answerApiResponseList = new ArrayList<>();

        if(question.isPresent()){
            questionApiResponse = read(question.get());
            answerList = answerRepository.findByQuestion(question.get());

            for(Answer answer : answerList){
                AnswerApiResponse answerApiResponse = AnswerApiResponse.builder()
                        .name(answer.getDoctor().getName())
                        .createdAt(answer.getCreatedAt())
                        .content(answer.getContent())
                        .build();

                answerApiResponseList.add(answerApiResponse);
            }
        }

        questionApiResponse.setSource(question.get().getSource());  // 응답 객체에 출처를 추가

        ConsultDetailApiResponse consultDetailApiResponse = ConsultDetailApiResponse.builder()
                .question(questionApiResponse)
                .answerList(answerApiResponseList)
                .build();

        return consultDetailApiResponse;
    }
}
