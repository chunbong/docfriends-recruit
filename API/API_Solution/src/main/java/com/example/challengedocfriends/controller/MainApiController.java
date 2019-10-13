package com.example.challengedocfriends.controller;

import com.example.challengedocfriends.model.network.response.QuestionApiResponse;
import com.example.challengedocfriends.service.MainApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainApiController {

    @Autowired
    private MainApiLogicService mainApiLogicService;

    @GetMapping("")
    public List<QuestionApiResponse> readAll() {

        return mainApiLogicService.readAll();
    }

}
