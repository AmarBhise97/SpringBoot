package com.school.School.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.School.Entity.School;
import com.school.School.Exception.InvalidNameException;
import com.school.School.Exception.schoolnotfoundexception;
import com.school.School.Repository.Schoolrepository;

@Service
public class Schoolservice {
	
	@Autowired
	 private Schoolrepository schoolrepo;
	
	public School addschool(School school) throws Exception {
		if(school.getSchoolname().isBlank()|| school.getSchoolname()==null) {
			throw new InvalidNameException("Invalid name please enter th evalid name");
		}
		else if(!school.getAddress().endsWith("pune")){
			throw new Exception("school is not found . only pune school are available");
			
		}
		else if(!(school.getSchoolmobile_no().length()==10)) {
			throw new Exception("Please type valid number....");
			
		}
		
		return schoolrepo.save(school);
		
		
	}
	
	public School getid(int id) throws Exception {
		Optional<School> schoole=schoolrepo.findById(id); 
		
		if(schoole.isEmpty()) {
			throw new Exception("please enter the valid id");
		}
		
		return schoole.get();
		
	}
	
	public List<School> getall() throws schoolnotfoundexception{
		List<School> school = schoolrepo.findAll();
		
		if(school.isEmpty()) {
			throw new schoolnotfoundexception("Schools not found .......");
		}
		
		return school;
	}
	
	
	
	
	

}
