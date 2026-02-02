package com.example.jpa.HibernetService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.HibernetService.Entity.Student;

public interface Student_repository extends JpaRepository<Student, Integer> {

}
