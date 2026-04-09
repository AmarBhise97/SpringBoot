package CRUDRevision.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import CRUDRevision.Entity.Student;
import CRUDRevision.Repository.StudentRepo;

@Service
public class StudentService {

	private StudentRepo repo;

	public StudentService(StudentRepo repo) {
		this.repo = repo;
	}

	public Student addStudent(Student student) {

		Student st = repo.save(student);

		return st;

	}
	
	public List<Student> getallStudent(){
		
		return repo.findAll();
	}
	
	public Student getid(int id) {
		
		return repo.findById(id).get();
	}
	
	public String deleteid(int id) {
		repo.deleteById(id);
		
		return "deleted" + id;
	}
	
	public Student updatestudent(int id,Student st) {
		st.setId(id);
		return repo.save(st);
		
	}

}
