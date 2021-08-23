/**
 * 
 */
package com.example.projecttaskassignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Class Status
 *
 */
@Entity
@Table(name = "status")
public class Status extends AuditModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer statusId;
	private Integer currentlyDoingCount;
	private Integer completedCount;
	private Integer toDoCount;
	@OneToOne
	@JoinColumn(name="developerId")
	private Developer developer;

	/**
	 * Constructor
	 *
	 */
	public Status(Integer statusId, Integer currentlyDoingCount, Integer completedCount, Integer toDoCount) {
		super();
		this.statusId = statusId;
		this.currentlyDoingCount = currentlyDoingCount;
		this.completedCount = completedCount;
		this.toDoCount = toDoCount;
	}

	/**
	 * Getter and setter
	 *
	 */
	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public Integer getCurrentlyDoingCount() {
		return currentlyDoingCount;
	}

	public void setCurrentlyDoingCount(Integer currentlyDoingCount) {
		this.currentlyDoingCount = currentlyDoingCount;
	}

	public Integer getCompletedCount() {
		return completedCount;
	}

	public void setCompletedCount(Integer completedCount) {
		this.completedCount = completedCount;
	}

	public Integer getToDoCount() {
		return toDoCount;
	}

	public void setToDoCount(Integer toDoCount) {
		this.toDoCount = toDoCount;
	}

}
