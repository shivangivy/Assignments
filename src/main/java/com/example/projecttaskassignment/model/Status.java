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

	/**
	 * Declared variable statusId for class Status
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer statusId;

	/**
	 * Declared variable currentlyDoingCount for class Status
	 *
	 */
	private Integer currentlyDoingCount;

	/**
	 * Declared variable completedCount for class Status
	 *
	 */
	private Integer completedCount;

	/**
	 * Declared variable toDoCount for class Status
	 *
	 */
	private Integer toDoCount;

	/**
	 * Declared variable developer of type Developer for class Status
	 *
	 */
	@OneToOne
	@JoinColumn(name = "developerId")
	private Developer developer;

	/**
	 * @param statusId
	 * @param currentlyDoingCount
	 * @param completedCount
	 * @param toDoCount
	 * @param developer
	 */
	public Status(final Integer statusId, final Integer currentlyDoingCount, final Integer completedCount,
			final Integer toDoCount, final Developer developer) {
		super();
		this.statusId = statusId;
		this.currentlyDoingCount = currentlyDoingCount;
		this.completedCount = completedCount;
		this.toDoCount = toDoCount;
		this.developer = developer;
	}

	/**
	 * @return the statusId
	 */
	public Integer getStatusId() {
		return statusId;
	}

	/**
	 * @param statusId
	 *            the statusId to set
	 */
	public void setStatusId(final Integer statusId) {
		this.statusId = statusId;
	}

	/**
	 * @return the currentlyDoingCount
	 */
	public Integer getCurrentlyDoingCount() {
		return currentlyDoingCount;
	}

	/**
	 * @param currentlyDoingCount
	 *            the currentlyDoingCount to set
	 */
	public void setCurrentlyDoingCount(final Integer currentlyDoingCount) {
		this.currentlyDoingCount = currentlyDoingCount;
	}

	/**
	 * @return the completedCount
	 */
	public Integer getCompletedCount() {
		return completedCount;
	}

	/**
	 * @param completedCount
	 *            the completedCount to set
	 */
	public void setCompletedCount(final Integer completedCount) {
		this.completedCount = completedCount;
	}

	/**
	 * @return the toDoCount
	 */
	public Integer getToDoCount() {
		return toDoCount;
	}

	/**
	 * @param toDoCount
	 *            the toDoCount to set
	 */
	public void setToDoCount(final Integer toDoCount) {
		this.toDoCount = toDoCount;
	}

	/**
	 * @return the developer
	 */
	public Developer getDeveloper() {
		return developer;
	}

	/**
	 * @param developer
	 *            the developer to set
	 */
	public void setDeveloper(final Developer developer) {
		this.developer = developer;
	}
}
