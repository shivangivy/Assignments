/**
 * 
 */
package com.example.projecttaskassignment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projecttaskassignment.model.ProjectManager;
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

	/**
	 * method to calculate colourResult for project manager
	 *
	 */
	public List<Task> calculateColorOfResult(final Integer projectManagerId) {
		final List<Task> taskList = projectManagerRepository.findProjectManagerById(projectManagerId);
		for (final Task task : taskList) {
			final String resultColour = taskService.calculateColorOfTask(task);
			task.setColourResult(resultColour);
			final String statusOfTask = taskService.calculateStatusofTask(task);
			task.setStatus(statusOfTask);
			taskRepository.save(task);
		}
		return taskList;
	}

	/**
	 * method to get Project Manager who has highest completed task
	 *
	 */
	public Optional<ProjectManager> getPmHighestTaskdone() {
		Integer projectManagerId = projectManagerRepository.projectManagerStatusDone();
		Optional<ProjectManager> newProjectManager = projectManagerRepository.findById(projectManagerId);
		return newProjectManager;
	}

}
