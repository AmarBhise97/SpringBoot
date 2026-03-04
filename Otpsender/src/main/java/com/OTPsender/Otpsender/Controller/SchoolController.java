package com.OTPsender.Otpsender.Controller;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OTPsender.Otpsender.Entity.School;
import com.OTPsender.Otpsender.Exception.InvalidOtpException;
import com.OTPsender.Otpsender.Exception.OtpExpireException;
import com.OTPsender.Otpsender.Service.MailService;
import com.OTPsender.Otpsender.Service.SchoolService;

@RestController
@RequestMapping("/otp")
@CrossOrigin(allowedHeaders = "*")
public class SchoolController {

	public SchoolService service;
	@Autowired
	public MailService mailservice;
	
	
	public SchoolController(SchoolService service) {
		this.service = service;
	}
	
	@PostMapping("addschool")
	public School add(@RequestBody School school ) {
		return service.addschool(school);
	}
	@GetMapping("getschool")
	public List<School> get(){
		return service.getSchool();
	}
	
	int otp;
	LocalDateTime starttime;
	@GetMapping("get-otp")
	public String getotp(@RequestParam String email) {
		
		 otp = (int) (Math.random() * 9000) + 1000;
		    starttime=LocalDateTime.now();
		    
		    mailservice.sendotp(email, otp);
		    
		    
		    return "OTP Sent To Your Email!!!";
	}
	
	@PostMapping("/verify-otp")
	public String verify(@RequestParam(value="otp") int otp1) throws OtpExpireException, InvalidOtpException {
		
		Duration duration = Duration.between(starttime, LocalDateTime.now());
		if (duration.getSeconds() >= 150) {
		    throw new OtpExpireException("OTP expired!!!");
		}
		
		if(!(otp==otp1)) {
			throw new InvalidOtpException("invalid otp!!!");
		}
		else {
			return "OTP Matched!!!";
		}
	}
		
	}

