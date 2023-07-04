package com.springboot.blog.repository;

import com.springboot.blog.entity.Stoke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stoke,Integer> {
    public Stoke findByStokeID(int id);

}
