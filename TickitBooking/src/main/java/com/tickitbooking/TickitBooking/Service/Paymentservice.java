package com.tickitbooking.TickitBooking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tickitbooking.TickitBooking.Entity.Googlepay;
import com.tickitbooking.TickitBooking.Entity.Payment;
import com.tickitbooking.TickitBooking.Entity.Phonepay;


@Service
public class Paymentservice {
	
	
	


	    public boolean processPayment(Payment payment, String userupi,String metroupi,double amount) throws Exception {
	        boolean flag=false;
	       if(payment.getClass()==Phonepay.class){	       
	    	   
	    	   Phonepay pay=new Phonepay();
	    	   pay.doPayment(userupi, metroupi, amount);
	    	   
	    	   System.out.println("Payment done by phonepe.");
	    			  flag=true;
	       }
	       else if(payment.getClass()==Googlepay.class)
	       {
	    	   Googlepay pay=new Googlepay();
	    	   pay.doPayment(userupi, metroupi, amount);
	    	   System.out.println("payment done by google pay....");
	    			  flag=true;
	       }
	    	   
	       else
	       {
	    	   flag=false;
	       }
	       
	       return flag;
	       
	    }
	

	    }
