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
 * Developer Class
 *
 */
@Entity
@Table(name = "developer")
public class Developer extends AuditModel {

	/**
	 * Declaring variable developerId
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer developerId;

	/**
	 * Declaring variable emailId for developer class
	 *
	 */
	private String emailId;

	/**
	 * Declaring variable name for developer class
	 *
	 */
	private String name;

	/**
	 * Declaring variable status of Type status for developer class
	 *
	 */

	@OneToOne
	@JoinColumn(name = "developerId")
	private Status status;

	/**
	 * @param developerId
	 * @param emailId
	 * @param name
	 * @param status
	 */
	public Developer(final Integer developerId, final String emailId, final String name, final Status status) {
		super();
		this.developerId = developerId;
		this.emailId = emailId;
		this.name = name;
		this.status = status;
	}

	/**
	 * Default Constructor
	 */
	public Developer() {
		super();
	}

	/**
	 * @return the developerId
	 */
	public Integer getDeveloperId() {
		return developerId;
	}

	/**
	 * @param developerId
	 *            the developerId to set
	 */
	public void setDeveloperId(final Integer developerId) {
		this.developerId = developerId;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(final String emailId) {
		this.emailId = emailId;
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
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(final Status status) {
		this.status = status;
	}

	/*
	 * to string method
	 */
	@Override
	public String toString() {
		return "Developer [developerId=" + developerId + ", emailId=" + emailId + ", name=" + name + ", status="
				+ status + "]";
	}

}
