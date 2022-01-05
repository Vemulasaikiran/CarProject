package com.example.CarProject.repository;

import com.example.CarProject.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Integer> {
}
