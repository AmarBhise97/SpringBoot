package com.example.jpa.HibernetService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.HibernetService.Entity.Employee;
import com.example.jpa.HibernetService.Repository.Employee_repository;

@RestController
@RequestMapping("/employeecontroller")
public class EmployeeController {
	
	@Autowired
	private Employee_repository repos;
	
	@PostMapping("/add")
	public Employee add(@RequestBody Employee employee) {
		
		System.out.println("Employee name is : "+employee.getName());
		repos.save(employee);
		
		return employee;
		
	}
	
	@GetMapping("/getall")
	public List<Employee> getemployee(){
		
		return repos.findAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public Employee getbyid(@PathVariable("id") int id) {
		System.out.println("id is returened : "+id);
		return repos.findById(id).get();
		
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleterbyid(@PathVariable("id") int id) {
		repos.deleteById(id);
		return "deleted secessfully : "+id;
	}
        

}
