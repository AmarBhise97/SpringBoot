package CRUDRevision.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CRUDRevision.Entity.School;
import CRUDRevision.Repository.SchoolRepo;

@Service
public class SchoolService {
	
	@Autowired
	private SchoolRepo repo;
	
	public SchoolService(SchoolRepo repo) {
		this.repo=repo;
	}
	
	
	public School AddSchool(School school) {
		return repo.save(school);
	}
	
	public List<School> getSchool(){
		return repo.findAll();
	}
	
	public School getschoolid(int id) {
		return repo.findById(id).get();
	}
	
	public String deletebyid(int id) {
		repo.deleteById(id );
		return "Delete Successfully ....."+ id;
	}
	
	public School update(long id,School st) {
		st.setId(id);
		return repo.save(st);
	}
	

}
