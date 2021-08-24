/**
 * 
 */
package com.example.projecttaskassignment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Task Class
 *
 */
@Entity
@Table(name = "task")
public class Task extends AuditModel {

	/**
	 * Declared variable taskId for class Task
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taskId;

	/**
	 * Declared variable name for class Task
	 *
	 */
	private String name;

	/**
	 * Declared variable status for class Task
	 *
	 */
	private String status;

	/**
	 * Declared variable colourResult for class Task
	 *
	 */
	private String colourResult;

	/**
	 * Declared variable createdDate for class Task
	 *
	 */
	private Date createdDate;

	/**
	 * Declared variable completedDate for class Task
	 *
	 */
	private Date completedDate;

	/**
	 * @param taskId
	 * @param name
	 * @param status
	 * @param colourResult
	 * @param createdDate
	 * @param completedDate
	 */
	public Task(final Integer taskId, final String name, final String status, final String colourResult,
			final Date createdDate, final Date completedDate) {
		super();
		this.taskId = taskId;
		this.name = name;
		this.status = status;
		this.colourResult = colourResult;
		this.createdDate = createdDate;
		this.completedDate = completedDate;
	}
	
	/**
	 * Parameterless constructor
	 */
	public Task() {
		super();
	}

	/**
	 * @return the taskId
	 */
	public Integer getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId
	 *            the taskId to set
	 */
	public void setTaskId(final Integer taskId) {
		this.taskId = taskId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(final String status) {
		this.status = status;
	}

	/**
	 * @return the colourResult
	 */
	public String getColourResult() {
		return colourResult;
	}

	/**
	 * @param colourResult
	 *            the colourResult to set
	 */
	public void setColourResult(final String colourResult) {
		this.colourResult = colourResult;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(final Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the completedDate
	 */
	public Date getCompletedDate() {
		return completedDate;
	}

	/**
	 * @param completedDate
	 *            the completedDate to set
	 */
	public void setCompletedDate(final Date completedDate) {
		this.completedDate = completedDate;
	}

	/*
	 * to string method
	 * 
	 */
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", name=" + name + ", status=" + status + ", colourResult=" + colourResult
				+ ", createdDate=" + createdDate + ", completedDate=" + completedDate + "]";
	}
	
}
