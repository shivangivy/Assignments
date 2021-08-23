package com.example.projecttaskassignment.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project_manager")
public class ProjectManager extends AuditModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer projectManagerId;
	private String name;
	private String emailId;
	private String country;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="projectManagerId")
	private List<Project> projects;

	/**
	 * Constructor
	 * 
	 * @param projectManaferId
	 * @param name
	 * @param emailId
	 * @param country
	 * @param projects
	 */
	public ProjectManager(Integer projectManagerId, String name, String emailId, String country,
			List<Project> projects) {
		super();
		this.projectManagerId = projectManagerId;
		this.name = name;
		this.emailId = emailId;
		this.country = country;
		this.projects = projects;
	}

	/**
	 * @return the projectManaferId
	 */
	public Integer getProjectManagerId() {
		return projectManagerId;
	}

	/**
	 * @param projectManaferId
	 *            the projectManaferId to set
	 */
	public void setProjectManagerId(Integer projectManagerId) {
		this.projectManagerId = projectManagerId;
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
	public void setName(String name) {
		this.name = name;
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
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(final String country) {
		this.country = country;
	}

	/**
	 * @return the projects
	 */
	public List<Project> getProjects() {
		return projects;
	}

	/**
	 * @param projects
	 *            the projects to set
	 */
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
