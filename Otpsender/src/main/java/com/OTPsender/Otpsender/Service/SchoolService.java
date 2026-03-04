package com.OTPsender.Otpsender.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.OTPsender.Otpsender.Entity.School;
import com.OTPsender.Otpsender.Repository.SchoolRepository;

@Service
public class SchoolService {

	
	public  SchoolRepository repo;
	
	public SchoolService(SchoolRepository repo) {
		this.repo=repo;
		
	}
	public School addschool(School school) {
		return repo.save(school);
	}
	public List<School> getSchool(){
		return repo.findAll();
	}
}
