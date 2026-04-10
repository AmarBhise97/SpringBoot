package CircularRelectionship.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CircularRelectionship.Dto.EmployeeDto;
import CircularRelectionship.Entity.Employee;
import CircularRelectionship.Services.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeResponse {
	
	private EmployeeService service;
		
	public EmployeeResponse(EmployeeService service) {
	       this.service=service;
	}
	
	@PostMapping("/addEmployee")
	public Employee AddEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@GetMapping("/getEmployee")
	public List<EmployeeDto> getEmployee(){
		return service.getEmployee();
	}

}
