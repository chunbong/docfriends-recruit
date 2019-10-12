package com.example.challengedocfriends.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ConsultDetailApiResponse {

    private MainApiResponse question;

    private String source;

    private List<ConsultDetailAnswerApiResponse> answer;

}
