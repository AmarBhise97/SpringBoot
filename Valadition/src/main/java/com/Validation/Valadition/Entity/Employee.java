package com.Validation.Valadition.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="EMP")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="EMP_id")
	private int id;
	
	@Size(min=5,max=10,message="please enter greater than 5 leters and less than 10 letters.........")
	private String name;
	
	@Size(min=4,max=20,message="please enter greater than 4 letters and less than 10 letters.....")
	private String address;
	
	@Size(min=9,max=11,message="please enter 10 numbers.....")
	private String mobilenumber;

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

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	
	
	
	
	
	

}
