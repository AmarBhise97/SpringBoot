package com.HCL.Hcl.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HCL.Hcl.Entity.Employee;

public interface Employeerepo extends JpaRepository<Employee, Integer> {

}
