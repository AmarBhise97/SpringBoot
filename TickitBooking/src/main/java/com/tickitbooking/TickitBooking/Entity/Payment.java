package com.tickitbooking.TickitBooking.Entity;


public interface Payment {

	
	public boolean doPayment(String userupi,String metroupii,double amount) throws Exception;
		
}
