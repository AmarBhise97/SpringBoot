package com.Blinkit.Blinkit.DTO;

import java.util.List;



public class UserDto {
	
	int userid;
	String username;
	
	List<Address2Dto> address;
	List<Order2Dto> order2;
	List<Review2Dto> review;
	
	

	public List<Review2Dto> getReview() {
		return review;
	}

	public void setReview(List<Review2Dto> review) {
		this.review = review;
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

	public List<Address2Dto> getAddress() {
		return address;
	}

	public void setAddress(List<Address2Dto> address) {
		this.address = address;
	}

	public List<Order2Dto> getOrder2() {
		return order2;
	}

	public void setOrder2(List<Order2Dto> order2) {
		this.order2 = order2;
	}
	
	

	
	
	

}
