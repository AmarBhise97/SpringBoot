package com.Springsecurity.SpringSecurity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.Springsecurity.SpringSecurity.Entity.Bank;
import com.Springsecurity.SpringSecurity.Repository.BankRepository;

@Service
public class BankService {
	
	@Autowired
	private BankRepository bankrepo;
	
	public Bank addBank(Bank bank) {
		
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder(5);
		System.out.println(bcrypt.encode(bank.getBankname()));
		
		return bankrepo.save(bank);
	}
	
	public List<Bank> getbank(){
		
		return bankrepo.findAll();
	}

}
