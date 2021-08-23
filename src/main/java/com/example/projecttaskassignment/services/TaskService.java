/**
 * 
 */
package com.example.projecttaskassignment.services;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

import com.example.projecttaskassignment.model.Task;

/**
 * Service Class Task
 *
 */
@Service
public class TaskService {

	public String calculateColorOfTask(Task task) {
		Date startedDate = task.getCreatedDate();
		Date endate = task.getCompletedDate();
	    long diffInMillies = Math.abs(endate.getTime() - startedDate.getTime());
	    long dayCount = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
			if (dayCount >= 15 && dayCount <= 30) {
				task.setColourResult("Green");
				return "Green";
			} else if (dayCount >= 7 && dayCount < 15) {
				task.setColourResult("Yellow");
				return "Yellow";
			} else if (dayCount >= 3 && dayCount < 7) {
				task.setColourResult("Orange");
				return "Orange";
			} else if (dayCount >= 0 && dayCount < 3) {
				task.setColourResult("Red");
				return "Red";
			}	
		return null;
	}

}
