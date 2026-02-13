package com.Springsecurity.SpringSecurity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springsecurity.SpringSecurity.Entity.UserEntity;
import com.Springsecurity.SpringSecurity.Repository.Userrepo;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private Userrepo user1;
	
	@PostMapping("/adduser")
	public UserEntity adduser(@RequestBody UserEntity user) {
		user.getUserRole().forEach(System.out::println);
		BCryptPasswordEncoder pass = new BCryptPasswordEncoder(5);
		
		UserEntity us = new UserEntity();
		us.setUserName(user.getUserName());
		us.setUserRole(user.getUserRole());
		System.out.println("user nefore encoded"+us.getPassword());
		us.setPassword(pass.encode(user.getPassword()));
		System.out.println("user after encoded"+us.getPassword());
		return user1.save(us);
		
	}
	@GetMapping("/getuser")
	public List<UserEntity> getuser(){
		return user1.findAll();
	}
}
