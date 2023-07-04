package com.springboot.blog.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Product")

public class Product {
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Id
    @Column(name = "productId")
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

    @OneToMany(mappedBy = "product")
    private List<Stoke> stokes;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    public Product() {
    }

    public Product(int productId, String name, String slug, String reference ,double price , double vat , boolean stockAble) {
        this.productId = productId;
        this.name = name;
        this.slug = slug;
        this.reference = reference;
        this.price =price;
        this.vat = vat;
        this.stockAble = stockAble;



    }

    public Product(String name, String slug, String reference ,double price , double vat , boolean stockAble) {
        this.name = name;
        this.slug = slug;
        this.reference = reference;
        this.price =price;
        this.vat = vat;
        this.stockAble = stockAble;
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

