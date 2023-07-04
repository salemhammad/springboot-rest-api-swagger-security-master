package com.springboot.blog.service;


import com.springboot.blog.entity.Order;
import com.springboot.blog.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public List<Order> getOrders()
    {
        return orderRepository.findAll();
    }

    public void addNewOrder(Order order) {
        orderRepository.save(order);
    }
    public Order getOrderById(int id){
        boolean exist =  orderRepository.existsById(id);
        if(!exist)
            throw new IllegalStateException("order with id "+ id +" dose not exist");
        return orderRepository.findByOrderId(id);
    }
    public void deleteOrder(int orderID) {

        boolean exist =  orderRepository.existsById(orderID);
        if(!exist)
            throw new IllegalStateException("Order with id "+ orderID +" dose not exist");
        orderRepository.deleteById(orderID);
    }
    @Transactional
    public void updateOrder(int orderId,int customerId, String date) {

        Order order = orderRepository.findById(orderId).orElseThrow(()->new IllegalStateException(
                "Order with id "+ orderId+" dose not exist"
        ));
        System.out.println(order.getOrderId());

        order.setDate(date);
        order.setCustomerID(customerId);

    }
}
