package com.HCL.Hcl.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HCL.Hcl.Entity.Company;

public interface Companyrepository extends JpaRepository<Company, Integer> {

}
