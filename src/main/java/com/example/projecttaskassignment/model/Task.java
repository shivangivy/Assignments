/**
 * 
 */
package com.example.projecttaskassignment.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;

/**
 * Task Class
 *
 */
@Entity
@Table(name = "task")
public class Task extends AuditModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taskId;
	private String name;
	private String status;
	private String colourResult;
	private Date createdDate;
	private Date completedDate;
	
	/**
	 * @param taskId
	 * @param name
	 * @param status
	 * @param colourResult
	 * @param createdDate
	 * @param completedDate
	 */
	public Task(Integer taskId, String name, String status, String colourResult, Date createdDate, Date completedDate) {
		super();
		this.taskId = taskId;
		this.name = name;
		this.status = status;
		this.colourResult = colourResult;
		this.createdDate = createdDate;
		this.completedDate = completedDate;
	}

	/**
	 * @return the taskId
	 */
	public Integer getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the colourResult
	 */
	public String getColourResult() {
		return colourResult;
	}

	/**
	 * @param colourResult the colourResult to set
	 */
	public void setColourResult(String colourResult) {
		this.colourResult = colourResult;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the completedDate
	 */
	public Date getCompletedDate() {
		return completedDate;
	}

	/**
	 * @param completedDate the completedDate to set
	 */
	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", name=" + name + ", status=" + status + ", colourResult=" + colourResult
				+ ", createdDate=" + createdDate + ", completedDate=" + completedDate + "]";
	}

	/**
	 * 
	 */
	public Task() {
		super();
	}
	
}
