package com.fileUploading.FileUploading.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fileUploading.FileUploading.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
