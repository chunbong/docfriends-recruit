package com.example.challengedocfriends.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MainApiResponse {

    private String location;

    private Integer age;

    private String gender;

    private String title;

    private List<String> tagList;

    private String content;

    private Integer answerCnt;

    private LocalDate createdAt;

}
