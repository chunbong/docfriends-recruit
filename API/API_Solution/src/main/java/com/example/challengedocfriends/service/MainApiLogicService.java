package com.example.challengedocfriends.service;

import com.example.challengedocfriends.model.entity.Question;
import com.example.challengedocfriends.model.entity.QuestionTagGroup;
import com.example.challengedocfriends.model.entity.Tag;
import com.example.challengedocfriends.model.entity.User;
import com.example.challengedocfriends.model.network.response.MainApiResponse;
import com.example.challengedocfriends.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MainApiLogicService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuestionTagGroupRepository questionTagGroupRepository;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private AnswerRepository answerRepository;


    public List<String> readTag(Question question){
        List<QuestionTagGroup> questionTagGroupList = questionTagGroupRepository.findByQuestion(question);
        List<String> tagList = new ArrayList<>();

        if (questionTagGroupList.size() > 0) {
            for (QuestionTagGroup questionTagGroup : questionTagGroupList) {
                System.out.println(questionTagGroup.getTag());
                Optional<Tag> optionalTag = tagRepository.findById(questionTagGroup.getTag().getId());
                optionalTag.ifPresent(tag -> System.out.println(tag.getName()));
                optionalTag.ifPresent(tag -> tagList.add(tag.getName()));
            }
        }

        return tagList;
    }


    public MainApiResponse read(Question question) {
        Optional<User> optionalUser = userRepository.findById(question.getUser().getId());

        if(optionalUser.isPresent()){
            MainApiResponse mainApiResponse = MainApiResponse.builder()
                    .location(optionalUser.get().getLocation())
                    .age(optionalUser.get().getAge())
                    .gender(optionalUser.get().getGender())
                    .title(question.getTitle())
                    .tagList(readTag(question))
                    .content(question.getContent())
                    .answerCnt(answerRepository.findByQuestion(question).size())
                    .createdAt(question.getCreatedAt())
                    .build();

            return mainApiResponse;
        }

        return null;
    }


    public List<MainApiResponse> readAll() {
        List<Question> questionList = questionRepository.findAll();
        List<MainApiResponse> mainApiResponseList = new ArrayList<>();

        for (Question question : questionList) {
            mainApiResponseList.add(read(question));
        }

        return mainApiResponseList;
    }
}
