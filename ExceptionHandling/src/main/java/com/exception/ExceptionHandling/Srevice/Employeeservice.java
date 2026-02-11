package com.exception.ExceptionHandling.Srevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.ExceptionHandling.Entity.Employee;
import com.exception.ExceptionHandling.Repository.EmployeeRepository;

@Service
public class Employeeservice {
	
	 @Autowired
	 private EmployeeRepository employeerepo;
	 
	 public Employee addEmployee(Employee employee) {
		 return employeerepo.save(employee);
	 }
	 
	 public List<Employee> getEmployee(){
		 List<Employee> emp = employeerepo.findAll();
		 return emp;
				 
				 
				 
	 }

}
