package com.exception.ExceptionHandling.Entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Company {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int companyid;
	
	String companyname;
	
	String companyprnnumber;
	
	double revanue;
	
	@CreationTimestamp
	LocalDateTime time;
	
	@OneToMany(mappedBy="company")
	@JsonManagedReference
	private List<Employee> employee;
	
	
	

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public int getCompanyid() {
		return companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyprnnumber() {
		return companyprnnumber;
	}

	public void setCompanyprnnumber(String companyprnnumber) {
		this.companyprnnumber = companyprnnumber;
	}

	public double getRevanue() {
		return revanue;
	}

	public void setRevanue(double revanue) {
		this.revanue = revanue;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	
	
}
