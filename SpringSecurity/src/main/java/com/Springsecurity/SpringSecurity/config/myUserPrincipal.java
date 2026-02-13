package com.Springsecurity.SpringSecurity.config;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.Springsecurity.SpringSecurity.Entity.UserEntity;


public class myUserPrincipal implements UserDetails {

	private UserEntity user;

	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> list = user.getUserRole().stream()
				.map((role) -> (new SimpleGrantedAuthority(role))).collect(Collectors.toList());
		return list;
	}

	public @Nullable String getPassword() {

		return user.getPassword();
	}

	public String getUsername() {

		return user.getUserName();
	}

	public myUserPrincipal(UserEntity user) {
		this.user = user;
	}

}
