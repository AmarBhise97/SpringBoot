package com.exception.ExceptionHandling.RepositoryTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import com.exception.ExceptionHandling.Entity.Company;
import com.exception.ExceptionHandling.Repository.CompanyRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
public class CompanyRepoTest {
	
	@Autowired
	private CompanyRepository companyrepo;
	
	@Test 
	public void chackCompany() {
		Company com = new Company();
		com.setCompanyname("HCL");
		com.setCompanyprnnumber("12345");
		com.setRevanue(1235.7);
		
		Company com2=companyrepo.save(com);
	
		 assertEquals("HCL", com.getCompanyname());
	}
	

	

}
