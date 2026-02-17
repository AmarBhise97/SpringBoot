package com.tickitbooking.TickitBooking.DTO;

import java.util.List;



public class CommuterDto {

	private String emailid;
	private List<String> upiid;
	private int commuterid;
	
	List<Tickit2Dto> tickit;
	
	


	public List<Tickit2Dto> getTickit() {
		return tickit;
	}


	public void setTickit(List<Tickit2Dto> tickit) {
		this.tickit = tickit;
	}


	private String username;


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public List<String> getUpiid() {
		return upiid;
	}


	public void setUpiid(List<String> upiid) {
		this.upiid = upiid;
	}


	public int getCommuterid() {
		return commuterid;
	}


	public void setCommuterid(int commuterid) {
		this.commuterid = commuterid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	
	
}
