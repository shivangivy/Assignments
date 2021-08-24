/**
 * 
 */
package com.example.projecttaskassignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projecttaskassignment.model.Developer;
import com.example.projecttaskassignment.repository.DeveloperRepository;

/**
 * Developer Service Class
 *
 */
@Service
public class DeveloperService {

	@Autowired
	private DeveloperRepository developerRepository;

	/**
	 * to get list of developer with status count
	 *
	 */
	public List<Developer> listOfDeveloper() {
		final List<Developer> developerList = developerRepository.findAll();
		for (final Developer developer : developerList) {

			final List<Developer> developerTaskDone = developerRepository.developerTaskDone(developer.getDeveloperId());
			developer.getStatus().setCompletedCount(developerTaskDone.size());

			final List<Developer> developerTaskDoing = developerRepository
					.developerTaskDoing(developer.getDeveloperId());
			developer.getStatus().setCurrentlyDoingCount(developerTaskDoing.size());

			final List<Developer> developerTaskToDo = developerRepository.developerTaskToDo(developer.getDeveloperId());
			developer.getStatus().setToDoCount(developerTaskToDo.size());

			developerRepository.save(developer);
		}

		return developerList;
	}

}
