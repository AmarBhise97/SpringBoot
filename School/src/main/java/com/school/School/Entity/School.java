package com.school.School.Entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="schoool")
public class School {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="schooluniid")
	
	int schoolid;
	@Size(min=5,max=10,message="enter valid name....")
	String schoolname;
//	@Max(value=11 , message="inavlid number")
//	@Min(value=9,message ="you try to next day...")
	@Size(min=9,max=11,message="invalid mobileno")
	String schoolmobile_no;
	String address;
	
	@CreationTimestamp
	private LocalDateTime schooll_entry_time;
	
	@OneToMany(mappedBy="school" ,cascade = CascadeType.PERSIST)
	private List<Student> student;
	
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public LocalDateTime getSchooll_entry_time() {
		return schooll_entry_time;
	}
	public void setSchooll_entry_time(LocalDateTime schooll_entry_time) {
		this.schooll_entry_time = schooll_entry_time;
	}
	public void setSchoolid(int schoolid) {
		this.schoolid = schoolid;
	}
	public int getSchoolid() {
		return schoolid;
	}
//	public void setSchoolid(int schoolid) {
//		this.schoolid = schoolid;
//	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getSchoolmobile_no() {
		return schoolmobile_no;
	}
	public void setSchoolmobile_no(String schoolmobile_no) {
		this.schoolmobile_no = schoolmobile_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer add(int a,int b) {
		int c;
		a=10;
		b=20;
		c=a+b;
		return 30;
	}
	
	public Integer multy(int a,int b) {
		int c;
		a=10;
		b=10;
	 c=a+b;
		return 20;
	}
	
	
	
	

}
