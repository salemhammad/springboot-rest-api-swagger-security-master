package com.example.salemwebser.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customer")
public class Customer {
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Id
    @Column(name = "customerId")
    private int customerId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "bornAtDate")
    private String bornAtDate;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Orders> orders;

    public Customer() {
    }
    public Customer(int CustomerId, String firstName, String lastName,String bornAtDate) {
        this.customerId = CustomerId;
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
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
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
                "CustomerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", date='" + bornAtDate + '\'' +
                '}';
    }
}
