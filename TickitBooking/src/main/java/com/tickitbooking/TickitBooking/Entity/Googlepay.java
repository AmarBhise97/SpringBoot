package com.tickitbooking.TickitBooking.Entity;

public class Googlepay implements Payment {


	public boolean doPayment(String userupi,String metroupii,double amount) throws InterruptedException {
		Thread.sleep(10000);
		return true;
	}

}
