package com.tickitbooking.TickitBooking.DTO;

import java.util.List;

import com.tickitbooking.TickitBooking.Entity.Commuter;

import jakarta.validation.constraints.NotNull;

public class TickitDto {

    private int tickitid;
	
	private String source;
	private String distination;
    private double amount;
    private String mode;
    
   
    private String username;
    
    

   
  
    
    
    public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	private List< String> upiid;
	public int getTickitid() {
		return tickitid;
	}
	public void setTickitid(int tickitid) {
		this.tickitid = tickitid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDistination() {
		return distination;
	}
	public void setDistination(String distination) {
		this.distination = distination;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public List<String> getUpiid() {
		return upiid;
	}
	public void setUpiid(List<String> upiid) {
		this.upiid = upiid;
	}
    
    
    

}
