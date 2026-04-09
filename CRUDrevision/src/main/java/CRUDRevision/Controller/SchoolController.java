package CRUDRevision.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CRUDRevision.Entity.School;
import CRUDRevision.Service.SchoolService;

@RestController
@RequestMapping("/School")
public class SchoolController {
	

	private SchoolService service;
	
	public SchoolController(SchoolService service) {
		
		this.service=service;
		
	}
	
	@PostMapping("/addschool")
	public School addschool(@RequestBody School school) {
		return service.AddSchool(school);
	}
	
	@GetMapping("/getallschool")
	public List<School> getschool(){
		return service.getSchool();
	}
	
	@GetMapping("/getid/{schoolid}")
	public School getid( @PathVariable("schoolid") int id ) {
		return service.getschoolid(id);
	}
	
	@DeleteMapping("/deleteid/{id}")
	public String deleteid(@PathVariable("id") int id) {
		service.deletebyid(id);
		return "delete syccessfully    "+id;
		
	}
	
	@PutMapping("/update/{id}")
	public School updateid(@PathVariable("id") long id, @RequestBody School sc) {
		
		return service.update(id, sc);
	}

}
