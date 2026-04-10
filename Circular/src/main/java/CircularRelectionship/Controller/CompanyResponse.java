package CircularRelectionship.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CircularRelectionship.Entity.Company;
import CircularRelectionship.Services.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyResponse {

	private CompanyService service;

	public CompanyResponse(CompanyService service) {
		this.service = service;

	}

	@PostMapping("/AddCompany")
	public Company addCompany(@RequestBody Company company) {
		return service.addCompany(company);
	}
	
	@GetMapping("/getCompany")
	public List<Company> getCompany() {
		return service.getCompany();
		
	}

}
