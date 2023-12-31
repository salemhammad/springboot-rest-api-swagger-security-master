package com.example.salemwebser.repository;

import com.example.salemwebser.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
public Product findByProductId(int id);
}
