package com.Revision.Revision.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Revision.Revision.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
