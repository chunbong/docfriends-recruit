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
@ToString(exclude = {"questionList"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String location;

    private Integer age;

    private String gender;

    // User 1 : N Question
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Question> questionList;

}
