package com.example.challengedocfriends.model.entity;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Accessors(chain = true)
@Entity
@ToString(exclude = {"user", "answerList", "questionTagGroupList"})
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String source;

    private LocalDate createdAt;

    private String createdBy;

    // Question N : 1 User
    @ManyToOne
    private User user;

    // Question 1 : N Answer
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
    private List<Answer> answerList;

    // Question 1 : N QuestionTagGroup
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
    private List<QuestionTagGroup> questionTagGroupList;

}
