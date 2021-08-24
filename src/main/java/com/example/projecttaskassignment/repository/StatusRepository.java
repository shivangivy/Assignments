/**
 * 
 */
package com.example.projecttaskassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projecttaskassignment.model.Status;

/**
 * Status Repository Interface
 *
 */
@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {

}
