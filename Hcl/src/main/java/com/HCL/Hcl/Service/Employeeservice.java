package com.HCL.Hcl.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HCL.Hcl.Entity.Employee;
import com.HCL.Hcl.Repository.Employeerepo;

@Service
public class Employeeservice {
	
	@Autowired
	private Employeerepo emprepo;

	
	public Employee addemp(Employee employee) {
		return emprepo.save(employee);
	}
	
	public List<Employee> getallemp(){
		return emprepo.findAll();
	}
}
