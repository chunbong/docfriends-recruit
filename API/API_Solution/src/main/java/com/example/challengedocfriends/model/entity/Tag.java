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
@ToString(exclude = {"questionTagGroupList"})
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Tag 1 : N QuestionTagGroup
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tag")
    private List<QuestionTagGroup> questionTagGroupList;

}
