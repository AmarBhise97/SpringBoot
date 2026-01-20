package com.phonepe.PaymentService.Demo;


import org.springframework.stereotype.Component;

@Component("PhonePe")

public class PhonePe implements Payment_Interface {

	
	public PhonePe() {
		System.out.println("Phone pay object created ....");
	}

	@Override
	public void doPayment() {
		System.out.println("Payment doing the phonepay....");
		
	}

}
