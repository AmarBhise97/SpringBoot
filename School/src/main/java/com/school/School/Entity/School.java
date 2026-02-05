package com.school.School.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class School {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int schoolid;
	String schoolname;
	String schoolmobile_no;
	String address;
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
	
	
	
	

}
