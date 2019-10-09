package com.example.challengedocfriends.repository;

import com.example.challengedocfriends.model.entity.QuestionTagGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionTagGroupRepository extends JpaRepository<QuestionTagGroup, Long> {
    List<QuestionTagGroup> findByQuestionId(Long id);
}
