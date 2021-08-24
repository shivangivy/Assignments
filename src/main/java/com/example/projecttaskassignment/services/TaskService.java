/**
 * 
 */
package com.example.projecttaskassignment.services;

import java.text.SimpleDateFormat;
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

	/**
	 * method to calculate colourResult of task
	 *
	 */
	public String calculateColorOfTask(final Task task) {
		final Date startedDate = task.getCreatedDate();
		final Date endate = task.getCompletedDate();
		final long diffInMillies = Math.abs(endate.getTime() - startedDate.getTime());
		final long dayCount = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
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

	/**
	 * method to calculate status of task
	 *
	 */
	public String calculateStatusofTask(final Task task) {
		Date startedDate = task.getCreatedDate();
		Date endate = task.getCompletedDate();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date today = new Date();
		if ((startedDate.compareTo(today) < 0) && (endate.compareTo(today) < 0)) {
			task.setStatus("Done");
			return "Done";
		} else if ((startedDate.compareTo(today) < 0) && (endate.compareTo(today) > 0)) {
			task.setStatus("Doing");
			return "Doing";
		} else if ((startedDate.compareTo(today) > 0) && (endate.compareTo(today) > 0)) {
			task.setStatus("ToDo");
			return "ToDo";
		}
		return null;
	}

}
