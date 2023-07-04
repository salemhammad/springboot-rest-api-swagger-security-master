package com.springboot.blog.repository;

import com.springboot.blog.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    public Customer findByCustomerId(int id);
}
