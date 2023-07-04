package com.springboot.blog.repository;

import com.springboot.blog.entity.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder,Integer> {
    public  ProductOrder findByProductId(int id);


}
