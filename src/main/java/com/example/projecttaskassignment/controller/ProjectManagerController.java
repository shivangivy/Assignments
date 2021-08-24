/**
 * 
 */
package com.example.projecttaskassignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.projecttaskassignment.model.ProjectManager;
import com.example.projecttaskassignment.model.Task;
import com.example.projecttaskassignment.services.ProjectManagerService;

/**
 * Project Manager Controller
 *
 */
@RestController
public class ProjectManagerController {
	@Autowired
	private ProjectManagerService projectManagerService;

	/**
	 * To calculate colourResult of task
	 *
	 */
	@GetMapping("/projectmanager/{projectManagerId}")
	public List<Task> calculateColorOfTasks(@PathVariable final Integer projectManagerId) {
		return projectManagerService.calculateColorOfResult(projectManagerId);
	}

	/**
	 * To get project manager who is having highest task completed
	 *
	 */
	@GetMapping("/highestTaskDone")
	public Optional<ProjectManager> getPmHighestTaskDone() {
		return projectManagerService.getPmHighestTaskdone();
	}
}
