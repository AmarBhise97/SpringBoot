package com.pagination.Pagination.DTo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;

import com.pagination.Pagination.Repository.CarRepository;

public class CarDTO {
	
	
int id;
	
	String name;
	
	String model;
	
	double averaje;
	
	@CreationTimestamp
	private LocalDateTime time;

	

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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getAveraje() {
		return averaje;
	}

	public void setAveraje(double averaje) {
		this.averaje = averaje;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	

}
