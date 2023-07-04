package com.springboot.blog.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Customer")
public class Customer {
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Id
    @Column(name = "CustomerId")
    private int CustomerId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "bornAtDate")
    private String bornAtDate;


    public Customer() {
    }
    public Customer(int CustomerId, String firstName, String lastName,String bornAtDate) {
        this.CustomerId = CustomerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornAtDate = bornAtDate;

    }
    public Customer(String firstName, String lastName,String bornAtDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornAtDate=bornAtDate;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public String getBornAtDate() {
        return bornAtDate;
    }

    public void setBornAtDate(String bornAtDate) {
        this.bornAtDate = bornAtDate;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "CustomerId=" + CustomerId +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", date='" + bornAtDate + '\'' +
                '}';
    }
}
