package com.example.challengedocfriends.controller;

import com.example.challengedocfriends.ifs.CrudInterface;
import com.example.challengedocfriends.model.Header;
import com.example.challengedocfriends.model.network.request.UserApiRequest;
import com.example.challengedocfriends.model.network.response.UserApiResponse;
import com.example.challengedocfriends.service.UserApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserApiController implements CrudInterface<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserApiLogicService userApiLogicService;


    @Override
    @PostMapping("")
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request) {
        return null;
    }


    @Override
    @PostMapping("/login")
    public Header<UserApiResponse> read(@RequestBody Header<UserApiRequest> request) {
        return userApiLogicService.read(request);
    }

    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }
}
