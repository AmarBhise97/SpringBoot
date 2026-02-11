package com.exception.ExceptionHandling.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exception.ExceptionHandling.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
