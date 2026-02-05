package com.school.School.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.School.Entity.School;

public interface Schoolrepository extends JpaRepository<School, Integer> {
	

}
