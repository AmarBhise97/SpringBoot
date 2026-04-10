package CircularRelectionship.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import CircularRelectionship.Dto.EmployeeDto;
import CircularRelectionship.Entity.Employee;
import CircularRelectionship.Repository.EmployeeRepo;

@Service
public class EmployeeService {

	private EmployeeRepo repo;

	public EmployeeService(EmployeeRepo repo) {
		this.repo = repo;

	}
	
	public Employee addEmployee(Employee employee) {
		Employee em = repo.save(employee);
		return em;
	}
	
	public List<EmployeeDto> getEmployee(){
		List<EmployeeDto> list = repo.findAll().stream().map(employee->{
			EmployeeDto emp = new EmployeeDto();
			emp.setId(employee.getId());
			emp.setName(employee.getName());
			emp.setAddress(employee.getAddress());
			emp.setCompanyid(employee.getCompany().getId());
			emp.setCompanyname(employee.getCompany().getName());
			return emp;
		}).collect(Collectors.toList());
		return list;
	}

}
