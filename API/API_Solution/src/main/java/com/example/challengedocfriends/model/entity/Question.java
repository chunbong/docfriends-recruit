package com.example.challengedocfriends.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private LocalDate createdAt;

    private String createdBy;

    // Question N : 1 User
    private User user;

    // Question 1 : N Answer
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "answer")
    private List<Answer> answerList;

}
