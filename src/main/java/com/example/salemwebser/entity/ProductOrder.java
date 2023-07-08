package com.example.salemwebser.entity;

import javax.persistence.*;

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
    @JoinColumn(name = "ordersId")
    private Orders orders;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private double price;
    @Column(name = "vat")
    private double vat;




    public ProductOrder() {
    }




    public int getProductId() {
        return id;
    }

    public void setProductId(int id) {
        this.id = id;
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
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                ", vat='" + vat + '\'' +
                '}';
    }
}
