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
	@Query(value = "select t from ProjectManager pm join pm.projects p join p.tasks t where pm.projectManagerId=:projectManagerId")
	List<Task> findProjectManagerById(@Param(value = "projectManagerId") Integer projectManagerId);

	/**
	 * Query to search for list of project manager whose status is done
	 *
	 */
	@Query(value = "SELECT pm.project_manager_id FROM project_manager pm JOIN project p\r\n"
			+ "ON pm.project_manager_id=p.project_manager_id INNER JOIN task t\r\n"
			+ "ON p.project_id=t.project_id INNER JOIN developer d\r\n"
			+ "ON t.task_id=d.task_id INNER JOIN status s\r\n" + "ON d.developer_id=s.developer_id\r\n"
			+ "WHERE t.\"status\" = 'Done'\r\n" + "ORDER BY s.completed_count DESC LIMIT 1", nativeQuery = true)
	Integer projectManagerStatusDone();
}
