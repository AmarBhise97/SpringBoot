package com.phonepe.PaymentService.Demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Primary
public class Googlepe implements Payment_Interface {

	public Googlepe() {
		System.out.println("Google pay object created....");
	}

	public void doPayment() {
		System.out.println("Payment doing using the Googlepe....");

	}

}
