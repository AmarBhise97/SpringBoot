package com.exception.ExceptionHandling.Srevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.exception.ExceptionHandling.Entity.Company;
import com.exception.ExceptionHandling.Repository.CompanyRepository;

@Service
public class Companyservice {
	
	@Autowired
	private CompanyRepository companyrepo;
	
	public Company addcompany(Company company) {
		
		return companyrepo.save(company);
	}
	
	public List<Company> getcompany(){
		List<Company> com =companyrepo.findAll();
		
		return com;
	}
	public Page<Company> getall( int num,int size){
		Pageable pagable = PageRequest.of(num, size);
		return companyrepo.findAll(pagable);
	}
	public Page<Company> getallcompany(int num,int size,String field,String direction){
		Sort son;
		if(direction.startsWith("d")|| direction.startsWith("D")) {
			Sort so =Sort.by(Sort.Direction.DESC, field);
			son=so;
		}
		else{
			Sort so =Sort.by(Sort.Direction.ASC, field);
			son=so;
		}
		Pageable pageable =PageRequest.of(num, size, son);
		return companyrepo.findAll(pageable);
	}

}
