package com.springboot.blog.controller;

import com.springboot.blog.entity.Order;
import com.springboot.blog.service.OrderService;
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
    public List<Order> getCustomers()
    {
        return orderService.getOrders();
    }
    @GetMapping(path="{OrderId}")
    public Order getOrderByID(@PathVariable int OrderId)
    {
        return orderService.getOrderById(OrderId);
    }
    @PostMapping
    public void addNewOrder(@RequestBody Order order) {
        orderService.addNewOrder(order);
    }
    @DeleteMapping(path = "{OrderId}")
    public void deleteOrder(@PathVariable("OrderId") int OrderId) {
        orderService.deleteOrder(OrderId);
    }

    @PutMapping(path = "{OrderId}")
    public void updateOrder(
            @PathVariable("OrderId") int OrderId,
            @RequestParam(required = false) int customerId,
            @RequestParam(required = false) String Date)
             {
                 orderService.updateOrder(OrderId,customerId,Date);
    }

}