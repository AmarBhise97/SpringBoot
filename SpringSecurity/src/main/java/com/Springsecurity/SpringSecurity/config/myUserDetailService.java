package com.Springsecurity.SpringSecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Springsecurity.SpringSecurity.Entity.UserEntity;
import com.Springsecurity.SpringSecurity.Repository.Userrepo;

@Service
public class myUserDetailService implements UserDetailsService {

	@Autowired
	private Userrepo repo;
	
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user=  repo.getUser(username);
		return new  myUserPrincipal(user);
	}

}
