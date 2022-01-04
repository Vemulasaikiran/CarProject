package com.example.CarProject.repository;

import com.example.CarProject.entity.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer> {
    List<Dealer> findByName(String name);
    List<Dealer> findByAddress(String address);



}
