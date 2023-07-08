package com.example.salemwebser.repository;

import com.example.salemwebser.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderRepository extends JpaRepository<Orders,Integer> {
    public Orders findByOrdersId(int id );
}
