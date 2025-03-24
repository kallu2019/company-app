package com.test.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.company.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
