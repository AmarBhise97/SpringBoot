package CircularRelectionship.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import CircularRelectionship.Entity.Company;
import CircularRelectionship.Repository.CompanyRepo;

@Service
public class CompanyService {

	private CompanyRepo repo;

	public CompanyService(CompanyRepo repo) {
		this.repo = repo;
	}

	public Company addCompany(Company company) {

		Company com = repo.save(company);

		return com;

	}
	
	public List<Company> getCompany(){
		
		return repo.findAll();
	}

}
