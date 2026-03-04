package com.OTPsender.Otpsender.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	 @Autowired
	    private JavaMailSender mailSender;
	 
	 public void sendotp(String email,int otp) {
		 SimpleMailMessage message = new SimpleMailMessage();
		 message.setFrom("bhiseamarwagholi@gmail.com");
		 message.setTo(email);
		 message.setSubject("Otp is ....");
		 message.setText("OTP is.. "+otp+" Otp is valid for only one minute");
		 mailSender.send(message);
		 }
	 }
