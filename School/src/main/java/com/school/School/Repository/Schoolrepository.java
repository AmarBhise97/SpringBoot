package com.school.School.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.school.School.Entity.School;

import jakarta.transaction.Transactional;

public interface Schoolrepository extends JpaRepository<School, Integer> {
	
   @Query(value="SELECT *FROM SCHOOOL WHERE SCHOOLNAME=:name;",nativeQuery=true)
   public List<School> getbyname(String name);
   
   @Modifying
   @Transactional
   @Query(value="update schoool set address =:a ,where schooluniid=:o",nativeQuery=true)
   public School updateaddress(@Param (value="p")String address,@Param(value="o") int schooluniid);
}
