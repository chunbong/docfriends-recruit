package com.example.challengedocfriends.service;

import com.example.challengedocfriends.model.entity.Answer;
import com.example.challengedocfriends.model.entity.Question;
import com.example.challengedocfriends.model.network.response.ConsultDetailAnswerApiResponse;
import com.example.challengedocfriends.model.network.response.ConsultDetailApiResponse;
import com.example.challengedocfriends.model.network.response.MainApiResponse;
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
        MainApiResponse mainApiResponse = null;
        List<Answer> answerList = new ArrayList<>();
        List<ConsultDetailAnswerApiResponse> consultDetailAnswerApiResponseList = new ArrayList<>();

        if(question.isPresent()){
            mainApiResponse = read(question.get());
            answerList = answerRepository.findByQuestion(question.get());

            for(Answer answer : answerList){
                ConsultDetailAnswerApiResponse consultDetailAnswerApiResponse = ConsultDetailAnswerApiResponse.builder()
                        .name(answer.getDoctor().getName())
                        .createdAt(answer.getCreatedAt())
                        .content(answer.getContent())
                        .build();

                consultDetailAnswerApiResponseList.add(consultDetailAnswerApiResponse);
            }
        }

        ConsultDetailApiResponse consultDetailApiResponse = ConsultDetailApiResponse.builder()
                .question(mainApiResponse)
                .source(question.get().getSource())
                .answer(consultDetailAnswerApiResponseList)
                .build();

        return consultDetailApiResponse;
    }
}
