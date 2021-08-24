/**
 * 
 */
package com.example.projecttaskassignment.controller;

import java.util.List;

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
	public List<Task> calculateColorOfTasks(@PathVariable final Integer projectManagerId){
		return projectManagerService.calculateColorOfResult(projectManagerId);
	}
}
