package com.example.salemwebser.entity;


import javax.persistence.*;

@Entity
@Table(name="Stoke")
public class Stoke {

    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Id
    @Column(name = "stokeID")
    private int stokeID;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "updateAtDateTime")
    private String updateAtDateTime;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Stoke() {
    }

    public int getStokeID() {
        return stokeID;
    }

    public void setStokeID(int stokeID) {
        this.stokeID = stokeID;
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
                ", quantity='" + quantity + '\'' +
                ", updateAtDateTime='" + updateAtDateTime + '\'' +
                '}';
    }
}
