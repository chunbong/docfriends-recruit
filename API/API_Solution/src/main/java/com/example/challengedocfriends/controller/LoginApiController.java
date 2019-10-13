package com.example.challengedocfriends.controller;

import com.example.challengedocfriends.model.network.request.LoginApiRequest;
import com.example.challengedocfriends.model.network.response.LoginApiResponse;
import com.example.challengedocfriends.service.LoginApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginApiController {

    @Autowired
    private LoginApiLogicService userApiLogicService;


    @PostMapping("")
    public LoginApiResponse read(@RequestBody LoginApiRequest request) {
        return userApiLogicService.read(request);
    }

}
