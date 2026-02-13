package com.Springsecurity.SpringSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springsecurity.SpringSecurity.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
