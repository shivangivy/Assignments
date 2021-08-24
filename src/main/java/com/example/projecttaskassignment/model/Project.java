/**
 * 
 */
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
 * Project Class
 *
 */
@Entity
@Table(name = "project")
public class Project extends AuditModel {

	/**
	 * Declared variable projectId for class Project
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer projectId;

	/**
	 * Declared variable name for class Project
	 *
	 */
	private String name;

	/**
	 * Declared variable duration for class Project
	 *
	 */
	private String duration;

	/**
	 * Declared variable tasks of type Task for class Project
	 *
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "projectId")
	private List<Task> tasks;

	/**
	 * Constructor
	 * 
	 * @param projectId
	 * @param name
	 * @param duration
	 * @param tasks
	 */
	public Project(final Integer projectId, final String name, final String duration, final List<Task> tasks) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.duration = duration;
		this.tasks = tasks;
	}

	/**
	 * Default constructor
	 */
	public Project() {
		super();
	}

	/**
	 * @return the projectId
	 */
	public Integer getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId
	 *            the projectId to set
	 */
	public void setProjectId(final Integer projectId) {
		this.projectId = projectId;
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
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(final String duration) {
		this.duration = duration;
	}

	/**
	 * @return the tasks
	 */
	public List<Task> getTasks() {
		return tasks;
	}

	/**
	 * @param tasks
	 *            the tasks to set
	 */
	public void setTasks(final List<Task> tasks) {
		this.tasks = tasks;
	}

	/*
	 *To string method
	 */
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", name=" + name + ", duration=" + duration + ", tasks=" + tasks
				+ "]";
	}
}
