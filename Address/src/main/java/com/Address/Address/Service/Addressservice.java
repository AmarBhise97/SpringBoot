package com.Address.Address.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Address.Address.Entity.Address;
import com.Address.Address.Repository.AddressRepo;

@Service
public class Addressservice {
	
	@Autowired
	private AddressRepo repo;
	
	
	public Address addaddress(Address address) {
		
		return repo.save(address);
		
		
	}
	
	public List<Address> getaddress(){
		return repo.findAll();
	}

}
