package com.example.challengedocfriends.model.entity;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Accessors(chain = true)
@Entity
@ToString(exclude = {"doctor", "question"})
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private LocalDate createdAt;

    private String createdBy;

    // Answer N : 1 Doctor
    @ManyToOne
    private Doctor doctor;

    // Answer N : 1 Question
    @ManyToOne
    private Question question;

}
