package com.example.salemwebser.controller;


import com.example.salemwebser.entity.Orders;
import com.example.salemwebser.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "OrderController")
public class OrderController {
    private final OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping
    public List<Orders> getCustomers()
    {
        return orderService.getOrders();
    }
    @GetMapping(path="{OrderId}")
    public Orders getOrderByID(@PathVariable int OrderId)
    {
        return orderService.getOrderById(OrderId);
    }
    @PostMapping
    public void addNewOrder(@RequestBody Orders orders) {
        orderService.addNewOrder(orders);
    }
    @DeleteMapping(path = "{OrderId}")
    public void deleteOrder(@PathVariable("OrderId") int OrderId) {
        orderService.deleteOrder(OrderId);
    }

    @PutMapping(path = "{OrderId}")
    public void updateOrder(
            @PathVariable("OrderId") int OrderId,
            @RequestParam(required = false) String Date)
             {
                 orderService.updateOrder(OrderId,Date);
    }

}