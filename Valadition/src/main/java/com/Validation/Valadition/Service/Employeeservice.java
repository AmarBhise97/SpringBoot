package com.Validation.Valadition.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Validation.Valadition.Entity.Employee;
import com.Validation.Valadition.Repository.EmployeeRepo;

@Service
public class Employeeservice {
	
	private EmployeeRepo repo;
	
	
	public Employeeservice(EmployeeRepo repo) {
		this.repo=repo;
		
	}
	
	public Employee addEmployee(Employee employee) {
		return repo.save(employee);
	}
	
	public List<Employee> getemployee(){
		return repo.findAll();
	}

}
