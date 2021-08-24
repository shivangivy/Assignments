/**
 * 
 */
package com.example.projecttaskassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projecttaskassignment.model.Developer;
import com.example.projecttaskassignment.services.DeveloperService;

/**
 * Controller class for Developer
 *
 */
@RestController
public class DeveloperController {
	@Autowired
	private DeveloperService developerService;

	/**
	 * to get list of developers with status
	 *
	 */
	@GetMapping("/developers")
	public List<Developer> getListOfDeveloper() {
		return developerService.listOfDeveloper();
	}

}
