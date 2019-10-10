package com.example.challengedocfriends.controller;

import com.example.challengedocfriends.ifs.CrudInterface;
import com.example.challengedocfriends.model.Header;
import com.example.challengedocfriends.model.network.request.MainApiRequest;
import com.example.challengedocfriends.model.network.response.MainApiResponse;
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
    public List<MainApiResponse> read() {

        return mainApiLogicService.read();
    }

}
