package com.example.projecttaskassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
/**
 * Main method
 *
 */
@SpringBootApplication
@EnableJpaAuditing
public class ProjectTaskAssignmentDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectTaskAssignmentDemoApplication.class, args);
	}
}
