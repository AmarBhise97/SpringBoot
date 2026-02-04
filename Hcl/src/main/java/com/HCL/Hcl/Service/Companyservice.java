package com.HCL.Hcl.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HCL.Hcl.Entity.Company;
import com.HCL.Hcl.Exception.InvalidCompanyException;
import com.HCL.Hcl.Repository.Companyrepository;

@Service
public class Companyservice {
	
	@Autowired
	private Companyrepository comrepo;
	
	public Company savecompany(Company company) throws Exception {
		if(!company.getCompanyemail().endsWith("@gmail.com")) {
			throw new Exception("this is incorrect Email");
		}
		if(company.getCompanyname().isBlank()) {
			throw new Exception("name is a blank.....");
		}
		return comrepo.save(company);
	}
	
	public Company getid(int id) throws InvalidCompanyException {
		if(Integer.valueOf(id)==null ||id<0) {
			throw new InvalidCompanyException();
		}
		return comrepo.findById(id).get();
		
	}
	
	public List<Company> getall(){
		return comrepo.findAll();
			
	}

}
