package CircularRelectionship.Dto;

public class EmployeeDto {

	int id;
	String name;
	String address ;
	
	
	int Companyid;
	String Companyname;
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
	public int getCompanyid() {
		return Companyid;
	}
	public void setCompanyid(int companyid) {
		Companyid = companyid;
	}
	public String getCompanyname() {
		return Companyname;
	}
	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}
	
	
	
}
