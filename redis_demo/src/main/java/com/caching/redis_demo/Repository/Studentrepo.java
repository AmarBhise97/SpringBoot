package com.caching.redis_demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caching.redis_demo.Entity.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {

}
