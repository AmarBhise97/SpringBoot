package com.Springsecurity.SpringSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springsecurity.SpringSecurity.Entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

}
