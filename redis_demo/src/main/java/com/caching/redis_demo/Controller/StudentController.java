package com.caching.redis_demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.caching.redis_demo.Entity.Student;
import com.caching.redis_demo.Repository.Studentrepo;

@RestController
public class StudentController {

	@Autowired
	private Studentrepo repo;

	@PostMapping("/addstudent")
	@CacheEvict(value = "students", allEntries = true)
	public Student addstudent(@RequestBody Student student) {

		return repo.save(student);

	}

	@GetMapping("/getstudent")
	
	@Cacheable(value = "students", key = "'all'")
	public List<Student> getstudent() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("getting the student");
		return repo.findAll();
	}
	
	@GetMapping("getid/{id}")
	@Cacheable(value="students",key="#id")
	public Student getid(@PathVariable("id") int id) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("geting the ids");
		return repo.findById(id).get();
		
	}

	@DeleteMapping("delete/{id}")
	@CacheEvict(value="students",key="#id")
	public String deletid(@PathVariable("id") int id) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("deleting the iddd");
		repo.deleteById(id);
		return "deleted";
	}
	@PutMapping("/updatestudent")
	@CachePut(value="updatestudent",key="#student.id")
	@CacheEvict(value = "students", allEntries = true)
	public Student updatestudent(@RequestBody Student student) {

		return repo.save(student);

	}
}
