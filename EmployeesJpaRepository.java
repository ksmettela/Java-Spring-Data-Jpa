package com.project.AssignmentJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesJpaRepository extends JpaRepository<EmployeesJpa, String> {
}
