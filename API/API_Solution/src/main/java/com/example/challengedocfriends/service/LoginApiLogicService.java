package com.example.challengedocfriends.service;

import com.example.challengedocfriends.model.entity.User;
import com.example.challengedocfriends.model.network.request.LoginApiRequest;
import com.example.challengedocfriends.model.network.response.LoginApiResponse;
import com.example.challengedocfriends.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginApiLogicService {

    @Autowired
    private UserRepository userRepository;


    public LoginApiResponse read(LoginApiRequest request) {
        LoginApiRequest userApiRequest = request;

        Optional<User> optional = userRepository.findByEmail(userApiRequest.getEmail());
        LoginApiResponse loginApiResponse = new LoginApiResponse();

        if(optional.isPresent()){
            if(optional.get().getPassword().equals(userApiRequest.getPassword())){
                loginApiResponse.setResultMessage("success");
                return loginApiResponse;
            }
        }

        loginApiResponse.setResultMessage("fail");
        return loginApiResponse;
    }
}
