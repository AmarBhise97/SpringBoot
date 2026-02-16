package com.tickitbooking.TickitBooking.Entity;

public class Phonepay implements Payment {


	public boolean doPayment(String userupi,String metroupi,double amount) throws InterruptedException {
	Thread.sleep(100000);
		return true;
	}

}
