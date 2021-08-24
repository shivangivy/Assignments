/**
 * 
 */
package com.example.projecttaskassignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.projecttaskassignment.model.Developer;

/**
 * Developer Repository Interface
 *
 */
@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Integer> {
	/**
	 * Query to search whose task status is Done
	 *
	 */
	@Query(value = "SELECT d from Task t join t.developer d join d.status s where t.status='Done' and d.developerId=:developerId")
	List<Developer> developerTaskDone(@Param(value = "developerId") Integer developerId);

	/**
	 * Query to search whose task status is Doing
	 *
	 */
	@Query(value = "SELECT d from Task t join t.developer d join d.status s where t.status='Doing' and d.developerId=:developerId")
	List<Developer> developerTaskDoing(@Param(value = "developerId") Integer developerId);

	/**
	 * Query to search whose task status is ToDo
	 *
	 */
	@Query(value = "SELECT d from Task t join t.developer d join d.status s where t.status='ToDo' and d.developerId=:developerId")
	List<Developer> developerTaskToDo(@Param(value = "developerId") Integer developerId);

}
