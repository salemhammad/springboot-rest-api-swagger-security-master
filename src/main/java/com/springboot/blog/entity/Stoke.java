package com.springboot.blog.entity;


import jakarta.persistence.*;

@Entity
@Table(name="Stoke")
public class Stoke {

    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Id
    @Column(name = "stokeID")
    private int stokeID;
    @Column(name = "productId")
    private int productId;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "updateAtDateTime")
    private String updateAtDateTime;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;




    public Stoke() {
    }

    public Stoke(int stokeID, int productId, int quantity, String updateAtDateTime) {
        this.stokeID = stokeID;
        this.productId = productId;
        this.quantity = quantity;
        this.updateAtDateTime = updateAtDateTime;
    }

    public Stoke(int productId, int quantity, String updateAtDateTime) {
        this.productId = productId;
        this.quantity = quantity;
        this.updateAtDateTime = updateAtDateTime;
    }

    public int getStokeID() {
        return stokeID;
    }

    public void setStokeID(int stokeID) {
        this.stokeID = stokeID;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUpdateAtDateTime() {
        return updateAtDateTime;
    }

    public void setUpdateAtDateTime(String updateAtDateTime) {
        this.updateAtDateTime = updateAtDateTime;
    }

    @Override
    public String toString() {
        return "Stoke{" +
                "stokeID=" + stokeID +
                ", productId='" + productId + '\'' +
                ", quantity='" + quantity + '\'' +
                ", updateAtDateTime='" + updateAtDateTime + '\'' +
                '}';
    }
}
