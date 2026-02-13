package com.Springsecurity.SpringSecurity.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.security.autoconfigure.web.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Mysecurity {
	
	@Autowired
private 	myUserDetailService service;
	
	@Bean
	public SecurityFilterChain mysecur(HttpSecurity http) {
	
		return http.csrf((i)->i.disable())
		.authorizeHttpRequests((req)-> req.requestMatchers(HttpMethod.POST).permitAll()
				.requestMatchers(HttpMethod.GET).hasAuthority("ADMIN")
				.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults())
		.build();
		
	}
	
//	@Bean
//	public UserDetailsService myuser() {
//		List<SimpleGrantedAuthority> list = new ArrayList<SimpleGrantedAuthority>();
//		list.add(new SimpleGrantedAuthority ("USER"));
//		User Amar =new User("Amar","{noop}Amar@123",list); 
//		
//		List<SimpleGrantedAuthority> list2 =new ArrayList<SimpleGrantedAuthority>();
//		list2.add(new SimpleGrantedAuthority("USER"));
//		list2.add(new SimpleGrantedAuthority("ADMIN"));
//		User Ankit = new User("Ankit","{noop}Ankit@123",list2);
//		
//		
//		return new InMemoryUserDetailsManager(Amar,Ankit);
//		
//	}
	
	@Bean
	public DaoAuthenticationProvider mydao() {
		
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(service);
		provider.setPasswordEncoder(new BCryptPasswordEncoder(5));
		return provider;
	}

}
