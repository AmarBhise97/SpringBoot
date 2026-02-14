package com.pagination.Pagination.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.pagination.Pagination.Entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
