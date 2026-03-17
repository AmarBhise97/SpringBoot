package com.Fetch.FetchAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Fetch.FetchAPI.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
