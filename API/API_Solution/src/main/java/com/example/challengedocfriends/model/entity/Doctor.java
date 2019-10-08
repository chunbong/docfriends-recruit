package com.example.challengedocfriends.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Doctor 1 : N Answer
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor")
    private List<Answer> answerList;

}
