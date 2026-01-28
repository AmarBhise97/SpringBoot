package com.phonepe.PaymentService.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class Makepayment {
	

   
	@Autowired
	 @Qualifier("PhonePe")
	private Payment_Interface payment;

	public void DoTranaction() {
		System.out.println("Making the payment....");
		payment.doPayment();
		System.out.println("Payment is Done !");
	}
//	@Autowired
//	public void Setpayment(@Qualifier("PhonePe") Payment_Interface payment) {
//		this.payment=payment;
//		System.out.println("setter...");
//	}
//    @Autowired
//	public Makepayment(@Qualifier("PhonePe") Payment_Interface payment) {
//		this.payment=payment;
//		System.out.println("MakePayment object created....");
//		System.out.println("CI");
//	}
	
	public Makepayment() {
		System.out.println("Normal con created..");
	}

}
