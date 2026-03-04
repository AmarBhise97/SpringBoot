package com.Springsecurity.SpringSecurity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springsecurity.SpringSecurity.Entity.Bank;
import com.Springsecurity.SpringSecurity.Repository.BankRepository;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	private BankRepository bankservice;
	
	@PostMapping("/addbank")
	public Bank addbanks(@RequestBody Bank bank) {
		return bankservice.save(bank);
	}
	
	@GetMapping("/getbank")
	public List<Bank> getallBank(){
		return bankservice.findAll();
	}
	
	

}
