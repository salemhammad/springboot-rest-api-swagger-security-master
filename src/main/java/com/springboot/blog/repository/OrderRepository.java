package com.springboot.blog.repository;

import com.springboot.blog.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderRepository extends JpaRepository<Order,Integer> {
    public Order findByOrderId(int id );
}
