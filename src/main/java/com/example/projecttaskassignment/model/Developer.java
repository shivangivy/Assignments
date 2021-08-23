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
@Table(name="developer")
public class Developer extends AuditModel{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer developerId;
	private String emailId;
	private String name;
	@OneToOne
	@JoinColumn(name="taskId")
	private Task task;
	
	/**
	 * @param developerId
	 * @param emailId
	 * @param name
	 * @param status
	 */
	public Developer(Integer developerId, String emailId, String name) {
		super();
		this.developerId = developerId;
		this.emailId = emailId;
		this.name = name;
	
	}

	/**
	 * @return the developerId
	 */
	public Integer getDeveloperId() {
		return developerId;
	}

	/**
	 * @param developerId the developerId to set
	 */
	public void setDeveloperId(Integer developerId) {
		this.developerId = developerId;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

}
