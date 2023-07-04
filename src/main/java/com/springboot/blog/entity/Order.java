package com.springboot.blog.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Order")
public class Order {

    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Id
    @Column(name = "orderId")
    private int orderId;
    @Column(name = "customerId")
    private int customerID;
    @Column(name = "Date")
    private String date;


    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;


    public Order() {
    }

    public Order(int orderId, int customerID, String date) {
        this.orderId = orderId;
        this.customerID = customerID;
        this.date = date;
    }
    public Order(int customerID, String date) {
        this.customerID = customerID;
        this.date = date;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerID='" + customerID + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}