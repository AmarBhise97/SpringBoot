package com.exception.ExceptionHandling.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exception.ExceptionHandling.Entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
