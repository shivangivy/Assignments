package com.example.projecttaskassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projecttaskassignment.model.ProjectManager;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<ProjectManager, Long> {
    
}
