package com.exception.ExceptionHandling.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exception.ExceptionHandling.Entity.Company;

import com.exception.ExceptionHandling.Srevice.Companyservice;

@RestController
@RequestMapping("company")
public class CompanyController {
	
	@Autowired
	private Companyservice companyservice;
	
	
	@PostMapping("/add")
	public Company addcompany(@RequestBody Company company) {
		return companyservice.addcompany(company);
	}
	
	@GetMapping("/get")
	public List<Company> getcompany(){
		return companyservice.getcompany();
	}
	
	@GetMapping("/getall")
	public Page<Company> getall(@RequestParam(value="num") int num,@RequestParam(value="size")int size){
		
		return companyservice.getall(num, size);
	}
	@GetMapping("/getallcompany")
	public Page<Company> getallcompany(@RequestParam(value="num") int num,@RequestParam(value="size")int size,@RequestParam(value="field")String field,@RequestParam(value="direction")String direction){
		return companyservice.getallcompany(num, size, field, direction);
	}
	

}
