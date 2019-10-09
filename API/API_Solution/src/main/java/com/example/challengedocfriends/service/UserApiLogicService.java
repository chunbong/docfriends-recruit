package com.example.challengedocfriends.service;

import com.example.challengedocfriends.ifs.CrudInterface;
import com.example.challengedocfriends.model.Header;
import com.example.challengedocfriends.model.entity.User;
import com.example.challengedocfriends.model.network.request.UserApiRequest;
import com.example.challengedocfriends.model.network.response.UserApiResponse;
import com.example.challengedocfriends.repository.UserRepository;
import jdk.javadoc.internal.doclets.formats.html.markup.Head;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserApiLogicService implements CrudInterface<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header<UserApiResponse> read(Header<UserApiRequest> request) {

        UserApiRequest userApiRequest = request.getData();

        Optional<User> optional = userRepository.findByEmail(userApiRequest.getEmail());

        if(optional.isPresent()){
            if(optional.get().getPassword().equals(userApiRequest.getPassword())){
                return response(optional.get());
            }else{
                return Header.ERROR("fail");
            }
        }

        return Header.ERROR("fail");
    }


    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }

    private Header<UserApiResponse> response(User user){

        UserApiResponse userApiResponse = UserApiResponse.builder()
                .result("success")
                .build();

        // Header + data return
        return Header.OK(userApiResponse);

    }

}
