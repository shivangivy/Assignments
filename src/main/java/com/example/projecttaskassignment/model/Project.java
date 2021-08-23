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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Project Class
 *
 */
@Entity
@Table(name = "project")
public class Project extends AuditModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer projectId;
	private String name;
	private String duration;
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
	public Project(Integer projectId, String name, String duration, List<Task> tasks) {
		super();
		this.projectId = projectId;
		this.name = name;
		this.duration = duration;
		this.tasks = tasks;
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
	public void setProjectId(Integer projectId) {
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
	public void setName(String name) {
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
	public void setDuration(String duration) {
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
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}
