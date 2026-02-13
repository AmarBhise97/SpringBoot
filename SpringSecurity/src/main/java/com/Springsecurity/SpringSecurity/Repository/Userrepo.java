package com.Springsecurity.SpringSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Springsecurity.SpringSecurity.Entity.UserEntity;

public interface Userrepo extends JpaRepository<UserEntity, Integer> {
	
	@Query (value="select * from user_entity where user_name= :nn;",nativeQuery=true)
	public UserEntity getUser(@Param(value="nn")String nn);

}
