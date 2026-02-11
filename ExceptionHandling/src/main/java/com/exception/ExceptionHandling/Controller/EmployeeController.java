package com.exception.ExceptionHandling.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.ExceptionHandling.Entity.Employee;
import com.exception.ExceptionHandling.Exception.DuplicateHeader;
import com.exception.ExceptionHandling.Srevice.Employeeservice;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private Employeeservice employeeservice;
	List<String> keys = new ArrayList<String>();
	@PostMapping("addemployee")
	public ResponseEntity<Employee> addemployee(@RequestBody Employee employee,@RequestHeader (value="key")  String key) throws Exception {
		if(keys.contains(key)) {
			throw new DuplicateHeader("duplicate employee");
		}
			keys.add(key);
		return new ResponseEntity<Employee>(employeeservice.addEmployee(employee) ,HttpStatus.FOUND);
	}
	
	@GetMapping("getemployee")
	public List<Employee> getEmployee(){
		return employeeservice.getEmployee();
		}
	
	

}
