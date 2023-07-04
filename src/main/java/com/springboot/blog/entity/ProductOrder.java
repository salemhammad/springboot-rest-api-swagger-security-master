package com.springboot.blog.entity;

import jakarta.persistence.*;

@Entity
@Table(name="ProductOrder")
public class ProductOrder {
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;

    @Column(name = "orderId")
    private int orderId;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private double price;
    @Column(name = "vat")
    private double vat;

    public ProductOrder() {
    }


    public ProductOrder(int id, int orderId, int quantity,double price , double vat) {
        this.id = id;
        this.orderId = orderId;
        this.quantity = quantity;
        this.price= price;
        this.vat = vat;
    }

    public int getProductId() {
        return id;
    }

    public void setProductId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "id=" + id +
                ", order=" + orderId +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                ", vat='" + vat + '\'' +
                '}';
    }
}
