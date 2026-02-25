package com.mailsender.MailSender.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mailsender.MailSender.Entity.Student;
@Repository
public interface Studentrepo extends JpaRepository<Student, Integer> {

}
