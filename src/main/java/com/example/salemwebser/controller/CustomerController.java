package com.example.salemwebser.controller;



import com.example.salemwebser.entity.Customer;
import com.example.salemwebser.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "customerController")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomer();
    }

    @GetMapping(path = "{CustomerId}")
    public Customer getCustomerByID(@PathVariable int CustomerId) {
        return customerService.getCustomerById(CustomerId);
    }

    @PostMapping
    public void addNewCustomer(@RequestBody Customer customer) {
        customerService.addNewCustomer(customer);
    }

    @DeleteMapping(path = "{CustomerId}")
    public void deleteCustomer(@PathVariable("CustomerId") int CustomerId) {
        customerService.deleteCustomer(CustomerId);
    }

    @PutMapping(path = "{CustomerId}")
    public void updateCustomer(
            @PathVariable("CustomerId") int CustomerId,
            @RequestParam(required = false) String fistName,
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) String bornAtDate) {
        customerService.updateCustomer(CustomerId, fistName, lastName, bornAtDate);
    }
}
