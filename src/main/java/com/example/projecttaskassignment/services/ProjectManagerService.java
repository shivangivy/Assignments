/**
 * 
 */
package com.example.projecttaskassignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projecttaskassignment.model.Task;
import com.example.projecttaskassignment.repository.ProjectManagerRepository;
import com.example.projecttaskassignment.repository.TaskRepository;

/**
 * Project Manager Service Class
 *
 */
@Service
public class ProjectManagerService {
	@Autowired
	private ProjectManagerRepository projectManagerRepository;
	@Autowired
	private TaskService taskService;
	@Autowired
	private TaskRepository taskRepository;

	public List<Task> calculateColorOfResult(Integer projectManagerId) {
		List<Task> taskList = projectManagerRepository.findProjectManagerById(projectManagerId);
		for (Task task : taskList) {
			String resultColour = taskService.calculateColorOfTask(task);
			task.setColourResult(resultColour);
			taskRepository.save(task);
		}
		return taskList;
	}

}