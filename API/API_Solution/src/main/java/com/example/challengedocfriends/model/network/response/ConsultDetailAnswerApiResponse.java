package com.example.challengedocfriends.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ConsultDetailAnswerApiResponse {

    private String name;

    private LocalDate createdAt;

    private String content;
}
