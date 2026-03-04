package com.caching.redis_demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caching.redis_demo.Entity.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student, Integer>  {

}
