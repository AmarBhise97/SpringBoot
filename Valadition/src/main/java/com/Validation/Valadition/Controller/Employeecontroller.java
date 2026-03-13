package com.Validation.Valadition.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Validation.Valadition.Entity.Employee;
import com.Validation.Valadition.Exception.DataIsEmptyException;
import com.Validation.Valadition.Service.Employeeservice;

import jakarta.validation.Valid;



@RestController
public class Employeecontroller {
	
	private Employeeservice service;
	
	public Employeecontroller(Employeeservice service) {
		this.service=service;
	}
	
	@PostMapping("addemployee")
	public Employee addEmployee( @Valid @RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@GetMapping("getemployee")
	public List<Employee> getemployee() throws DataIsEmptyException{
		List<Employee> employee=service.getemployee();
		if(employee.isEmpty()) {
			throw new DataIsEmptyException("Not data present");
		}
		return employee;
	}

}
