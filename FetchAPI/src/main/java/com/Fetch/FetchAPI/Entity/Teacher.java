package com.Fetch.FetchAPI.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;
	
	private String teachername;
	
	private String teacheraddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public String getTeacheraddress() {
		return teacheraddress;
	}

	public void setTeacheraddress(String teacheraddress) {
		this.teacheraddress = teacheraddress;
	}
	
	
	
	
	

}
