package com.OTPsender.Otpsender.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OTPsender.Otpsender.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
