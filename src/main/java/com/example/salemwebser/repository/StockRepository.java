package com.example.salemwebser.repository;

import com.example.salemwebser.entity.Stoke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stoke,Integer> {
    public Stoke findByStokeID(int id);

}
