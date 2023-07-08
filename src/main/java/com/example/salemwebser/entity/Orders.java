package com.example.salemwebser.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="orders")
public class Orders {

    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Id
    @Column(name = "ordersId")
    private int ordersId;
    @Column(name = "Date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
    private List<ProductOrder> productOrders;

    public Orders() {
    }



    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int orderId) {
        this.ordersId = orderId;
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
                "orderId=" + ordersId +
                ", date='" + date + '\'' +
                '}';
    }
}