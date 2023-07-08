package com.example.salemwebser.service;


import com.example.salemwebser.entity.Customer;
import com.example.salemwebser.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> getCustomer()
    {
        return customerRepository.findAll();
    }

    public void addNewCustomer(Customer customer) {
        customerRepository.save(customer);
    }
    public Customer getCustomerById(int id){
        boolean exist =  customerRepository.existsById(id);
        if(!exist)
            throw new IllegalStateException("customer with id "+ id +" dose not exist");
        return customerRepository.findByCustomerId(id);
    }

    public void deleteCustomer(int customerID) {

        boolean exist =  customerRepository.existsById(customerID);
        if(!exist)
            throw new IllegalStateException("customer with id "+ customerID +" dose not exist");
        customerRepository.deleteById(customerID);
    }
    @Transactional
    public void updateCustomer(int customerID,String firstName, String lastName ,String bornAtDate ) {

        Customer customer = customerRepository.findById(customerID).orElseThrow(()->new IllegalStateException(
                "Customer with id "+ customerID+" dose not exist"
        ));
        System.out.println(customer.getCustomerId());

        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setBornAtDate(bornAtDate);

    }
}
