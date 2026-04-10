package CircularRelectionship.Dto;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;



public class CompanyDto {
	
	int id;
	String name;
	String address;

	@CreationTimestamp
	private LocalDateTime time;
	
	List<Employee2Dto> employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public List<Employee2Dto> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee2Dto> employee) {
		this.employee = employee;
	}
	
	
	
	


}
