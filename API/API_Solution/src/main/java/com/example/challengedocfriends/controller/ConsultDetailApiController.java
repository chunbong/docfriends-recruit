package com.example.challengedocfriends.controller;

import com.example.challengedocfriends.model.network.response.ConsultDetailApiResponse;
import com.example.challengedocfriends.service.ConsultDetailApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConsultDetailApiController {

    @Autowired
    ConsultDetailApiLogicService consultDetailApiLogicService;

    @GetMapping("{id}") // /{id}
    public ConsultDetailApiResponse read(@PathVariable(name = "id") Long id) {

        return consultDetailApiLogicService.read(id);

    }
}