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

/**
 * Project Manager Class
 *
 */
@Entity
@Table(name = "project_manager")
public class ProjectManager extends AuditModel {

	/**
	 * Declared variable projectManagerId for class project manager
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer projectManagerId;

	/**
	 * Declared variable name for class project manager
	 *
	 */
	private String name;

	/**
	 * Declared variable emailId for class project manager
	 *
	 */
	private String emailId;

	/**
	 * Declared variable country for class project manager
	 *
	 */
	private String country;

	/**
	 * Declared variable projects of type Project for class project manager
	 *
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "projectManagerId")
	private List<Project> projects;

	/**
	 * Constructor
	 * @param projectManaferId
	 * @param name
	 * @param emailId
	 * @param country
	 * @param projects
	 */
	public ProjectManager(final Integer projectManagerId, final String name, final String emailId, final String country,
			final List<Project> projects) {
		super();
		this.projectManagerId = projectManagerId;
		this.name = name;
		this.emailId = emailId;
		this.country = country;
		this.projects = projects;
	}

	/**
	 * Default constructor
	 */
	public ProjectManager() {
		super();
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
	public void setProjectManagerId(final Integer projectManagerId) {
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
	public void setName(final String name) {
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
	public void setEmailId(final String emailId) {
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
	public void setProjects(final List<Project> projects) {
		this.projects = projects;
	}

	/*
	 * to string method
	 */
	@Override
	public String toString() {
		return "ProjectManager [projectManagerId=" + projectManagerId + ", name=" + name + ", emailId=" + emailId
				+ ", country=" + country + ", projects=" + projects + "]";
	}
}
