package com.HCL.Hcl.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HCL.Hcl.Entity.Company;
import com.HCL.Hcl.Exception.InvalidCompanyException;
import com.HCL.Hcl.Repository.Companyrepository;
import com.HCL.Hcl.Service.Companyservice;

@RestController
@RequestMapping("/companycontroller")
public class Companycontroller {
	
	
	@Autowired
	private Companyservice companyser;
	
	
	@PostMapping("/addcom")
	public Company addcompany(@RequestBody Company company ) throws Exception {
		
		return companyser.savecompany(company);
	}
	
	@GetMapping("/getid/{id}")
	public Company getid2(@PathVariable("id") int id) throws InvalidCompanyException {
		
		return companyser.getid(id);
	}
	
	@GetMapping("/getall")
	public List<Company> getall2(){
		return companyser.getall();
	}

}
