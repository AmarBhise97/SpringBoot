package com.Revision.Revision.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Revision.Revision.Dto.StudentDto;
import com.Revision.Revision.Entity.Student;
import com.Revision.Revision.Repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository repo;
	
	public StudentService(StudentRepository repo) {
		
		this.repo=repo;
	}
	
	public Student Addstudent(Student student) {
		Student sc = repo.save(student);
		
		return sc;
	}
	
	public List<StudentDto> getStudent(int num,int size){
		
		Pageable pageable = PageRequest.of(num, size);
		List<StudentDto> list=repo.findAll(pageable).stream().map((page)->{
		StudentDto st = new StudentDto();
		st.setId(page.getId());
		st.setAddress(page.getAddress());
		st.setName(page.getName());
		return st;
		
		}).collect(Collectors.toList());
		return list;
		
		
	}
	public List<StudentDto> getallstudent(int num,int size,String field,String direction){
		Sort sor;
		if(direction.equals("DESC")|| direction.equals("desc")) {
			sor=Sort.by(Sort.Direction.DESC,field);
		}
		else {
			sor=Sort.by(Sort.Direction.ASC,field);
		}
		Pageable page= PageRequest.of(num, size, sor);
		List<StudentDto> list = repo.findAll(page).stream().map((p)->{
			StudentDto st = new StudentDto();
			st.setId(p.getId());
			st.setAddress(p.getAddress());
			st.setName(p.getName());
		
		return st;	
		}).collect(Collectors.toList());
		return list;
		
	}

}
