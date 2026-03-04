package com.OTPsender.Otpsender.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OTPsender.Otpsender.Entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {

}
