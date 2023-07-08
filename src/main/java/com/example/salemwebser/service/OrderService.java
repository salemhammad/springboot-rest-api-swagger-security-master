package com.example.salemwebser.service;



import com.example.salemwebser.entity.Orders;
import com.example.salemwebser.repository.OrderRepository;
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
    public List<Orders> getOrders()
    {
        return orderRepository.findAll();
    }

    public void addNewOrder(Orders orders) {
        orderRepository.save(orders);
    }
    public Orders getOrderById(int id){
        boolean exist =  orderRepository.existsById(id);
        if(!exist)
            throw new IllegalStateException("order with id "+ id +" dose not exist");
        return orderRepository.findByOrdersId(id);
    }
    public void deleteOrder(int orderID) {

        boolean exist =  orderRepository.existsById(orderID);
        if(!exist)
            throw new IllegalStateException("Order with id "+ orderID +" dose not exist");
        orderRepository.deleteById(orderID);
    }
    @Transactional
    public void updateOrder(int orderId, String date) {

        Orders orders = orderRepository.findById(orderId).orElseThrow(()->new IllegalStateException(
                "Order with id "+ orderId+" dose not exist"
        ));
        System.out.println(orders.getOrdersId());

        orders.setDate(date);

    }
}
