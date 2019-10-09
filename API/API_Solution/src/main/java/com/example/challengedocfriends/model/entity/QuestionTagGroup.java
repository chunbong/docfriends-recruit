package com.example.challengedocfriends.model.entity;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Accessors(chain = true)
@Entity
@ToString(exclude = {"question", "tag"})
public class QuestionTagGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // QuestionTagGroup N : 1 Question
    @ManyToOne
    private Question question;

    // QuestionTagGroup N : 1 Tag
    @ManyToOne
    private Tag tag;

}
