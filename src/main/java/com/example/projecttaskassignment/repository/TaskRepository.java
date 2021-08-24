/**
 * 
 */
package com.example.projecttaskassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projecttaskassignment.model.Task;

/**
 * Task Repository
 *
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
