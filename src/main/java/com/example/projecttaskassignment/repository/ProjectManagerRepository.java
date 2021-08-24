/**
 * 
 */
package com.example.projecttaskassignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

import com.example.projecttaskassignment.model.ProjectManager;
import com.example.projecttaskassignment.model.Task;

/**
 * Project Manager Repository
 *
 */
@Repository
public interface ProjectManagerRepository extends JpaRepository<ProjectManager, Integer> {
	
	/**
	 * Query to get list of tasks associated with project manager
	 *
	 */
	@Query(value="select t from ProjectManager pm join pm.projects p join p.tasks t where pm.projectManagerId=:projectManagerId")
	List<Task> findProjectManagerById(@Param(value="projectManagerId") Integer projectManagerId);
}
