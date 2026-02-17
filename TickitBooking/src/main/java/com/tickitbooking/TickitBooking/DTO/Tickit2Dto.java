package com.tickitbooking.TickitBooking.DTO;

public class Tickit2Dto {

	
    private int tickitid;
	
	private String source;
	private String distination;
    private double amount;
    
    private String mode;

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

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
    
    
    
}
