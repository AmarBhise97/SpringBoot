package com.school.School.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="schoool")
public class School {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="schooluniid")
	int schoolid;
	String schoolname;
	String schoolmobile_no;
	String address;
	
//	@CreationTimestamp
//	private LocalDateTime schooll_entry_time;
//	
	
	
//	public LocalDateTime getSchooll_entry_time() {
//		return schooll_entry_time;
//	}
//	public void setSchooll_entry_time(LocalDateTime schooll_entry_time) {
//		this.schooll_entry_time = schooll_entry_time;
//	}
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
	
	
	
	

}
