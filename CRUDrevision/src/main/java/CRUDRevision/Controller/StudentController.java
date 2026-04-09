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

import CRUDRevision.Entity.Student;
import CRUDRevision.Service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {

		this.service = service;
	}
	
	@PostMapping("/addstudent")
	public Student AddStudent(Student student) {
		
		return service.addStudent(student);
	}
	
	@GetMapping("/getallstudent")
	public List<Student> getallstudent(){
		
		return service.getallStudent();
	}
	
	@GetMapping("/getid/{id}")
	public Student getid(@PathVariable("id") int  id) {
		
		return service.getid(id);
	}
	
	@DeleteMapping("/deleteid/{id}")
	public String deleteid(@PathVariable("id") int id) {
		
		return service.deleteid(id);
	}
	
	@PutMapping("/update/{updateid}")
	public Student updateid(@PathVariable("updateid") int id,@RequestBody Student st) {
		 return service.updatestudent(id, st);
	}

}
