package com.Address.Address.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Address.Address.Entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
