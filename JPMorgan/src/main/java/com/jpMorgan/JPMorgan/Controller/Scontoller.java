package com.jpMorgan.JPMorgan.Controller;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpMorgan.JPMorgan.DTO.StudentDTO;
import com.jpMorgan.JPMorgan.Entity.Student;






@RestController
@RequestMapping("/ar")
public class Scontoller {

	List<Student> li =new ArrayList<Student>();
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student)
	{
		
		System.out.println(student.getName());
		System.out.println(student.getName()+" in a school "+student.getSchool().getName_Sc());
		return student;
	}
	@GetMapping("/get")
	public List<StudentDTO> addDTO(){
		
			return li.stream().map((i)->{
				StudentDTO dto = new StudentDTO();
				dto.setName(i.getName());
				dto.setAddress(i.getSchool().getName_Sc());
				dto.setAddress(i.getSchool().getAddress());
				return dto;
				
				
			}).collect(Collectors.toList());
	}

	
}
