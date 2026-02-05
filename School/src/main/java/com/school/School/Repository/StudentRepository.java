package com.school.School.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.School.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
