package com.Address.Address.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Address.Address.Entity.Address;
import com.Address.Address.Service.Addressservice;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private Addressservice service;
	
	@PostMapping("/addaddress")
	@CacheEvict(value = "address", allEntries = true)
	public Address addaddress(@RequestBody Address address) {
		
		return service.addaddress(address);
	}
	
	@GetMapping("/getaddress")
	@Cacheable(value = "address", key = "'all'")
	public List<Address> getaddress() throws InterruptedException{
		Thread.sleep(3000);
		return service.getaddress();
	}

}
