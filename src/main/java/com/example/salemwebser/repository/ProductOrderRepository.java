package com.example.salemwebser.repository;

import com.example.salemwebser.entity.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder,Integer> {
    public ProductOrder findById(int id);


}
