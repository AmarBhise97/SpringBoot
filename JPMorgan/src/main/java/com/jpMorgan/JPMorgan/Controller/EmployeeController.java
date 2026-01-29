package com.jpMorgan.JPMorgan.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpMorgan.JPMorgan.DTO.EmployeeDto;
import com.jpMorgan.JPMorgan.Entity.Employee;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {
	List<Employee> list = new ArrayList<Employee>();

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		if (employee != null) {
			list.add(employee);
			System.out.println("Size of DB : " + list.size());
			System.out.println(employee.getName() + " of Company :" + employee.getCompany().getCompany_Name()
					+ "Added Successfully ...");
		}
		return employee;
	}
	@GetMapping("/addall")
	public List<EmployeeDto> getall(){
		return list.stream().map((i)->{
			EmployeeDto dto = new EmployeeDto();
			dto.setName(i.getName());
			dto.setId(i.getId());
			dto.setCompany_Name(i.getCompany().getCompany_Name());
			dto.setGst_Number(i.getCompany().getGst_Number());
			
			return dto;
			}).collect(Collectors.toList());
	}

}
