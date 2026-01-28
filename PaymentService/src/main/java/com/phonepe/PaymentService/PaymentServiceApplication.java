package com.phonepe.PaymentService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.phonepe.PaymentService.Demo.Googlepe;
import com.phonepe.PaymentService.Demo.Makepayment;





@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context=  SpringApplication.run(PaymentServiceApplication.class, args);
		String str[]= context.getBeanDefinitionNames();
		System.out.println("======================================================================");
		System.out.println("Total Beans in string application "+str.length);
		
		
		
//		for(String s:str){
//		System.out.println(s);
//		}
		Makepayment pay = context.getBean(Makepayment.class);
		
		Makepayment pay2 = context.getBean(Makepayment.class);
		System.out.println(pay.equals(pay2));
		System.out.println(pay==(pay2));
		
//		pay.DoTranaction();
//		
//		Thread.sleep(5000);
//		Googlepe gp = context.getBean(Googlepe.class);
//		
//		gp.doPayment();
//		
		
		
		
		
	}

}
