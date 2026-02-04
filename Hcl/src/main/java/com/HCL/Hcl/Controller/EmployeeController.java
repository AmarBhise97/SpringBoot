package com.HCL.Hcl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HCL.Hcl.Entity.Employee;
import com.HCL.Hcl.Service.Employeeservice;

@RestController
@RequestMapping("/Employeecontroller")
public class EmployeeController {
	
	@Autowired
	private Employeeservice empservice;
	
	@PostMapping("/addemp")
	public Employee addemp1(@RequestBody Employee employee) {
		
		return empservice.addemp(employee);
	}
	
	@GetMapping("getemp")
	public List<Employee> getallemp(){
		
		return empservice.getallemp();
	}
	

}
