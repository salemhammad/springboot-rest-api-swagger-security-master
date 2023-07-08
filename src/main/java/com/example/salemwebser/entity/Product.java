package com.example.salemwebser.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Product")

public class Product {
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Id
    private int productId;
    @Column(name = "slug")
    private String slug;
    @Column(name = "name")
    private String name;
    @Column(name = "reference")
    private String reference;
    @Column(name = "price")
    private double price;
    @Column(name = "vat")
    private double vat;
    @Column(name = "stockAble")
    private boolean stockAble;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Stoke> stocks;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductOrder> productOrders;


    public Product() {
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public boolean isStockAble() {
        return stockAble;
    }

    public void setStockAble(boolean stockAble) {
        this.stockAble = stockAble;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductId=" + productId +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", reference='" + reference + '\'' +
                ", price='" + price + '\'' +
                ", vat='" + vat + '\'' +
                ", stockAble='" + stockAble + '\'' +
                '}';
    }
}

