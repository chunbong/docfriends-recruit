package com.example.challengedocfriends.model.entity;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Accessors(chain = true)
@Entity
@ToString(exclude = {"answerList"})
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Doctor 1 : N Answer
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "doctor")
    private List<Answer> answerList;

}
