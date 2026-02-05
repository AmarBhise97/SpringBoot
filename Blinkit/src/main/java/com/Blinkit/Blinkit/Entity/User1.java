package com.Blinkit.Blinkit.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int userid;
	String username;
	String usermonumber;
	
	@OneToMany(mappedBy="user")
	private List<Order1> order;
	
	
	@OneToMany(mappedBy="user")
	private List<Address> address;

	@OneToMany(mappedBy="user")
	private List<Review>review;
	
	
	
	
	public List<Review> getReview() {
		return review;
	}
	public void setReview(List<Review> review) {
		this.review = review;
	}
	public List<Order1> getOrder() {
		return order;
	}
	public void setOrder(List<Order1> order) {
		this.order = order;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsermonumber() {
		return usermonumber;
	}
	public void setUsermonumber(String usermonumber) {
		this.usermonumber = usermonumber;
	}
	
	
	
	
	

}
