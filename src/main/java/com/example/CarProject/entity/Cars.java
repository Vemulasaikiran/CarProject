package com.example.CarProject.entity;

import javax.persistence.*;

@Entity
@Table(name = "CarsPrice")
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String modelName;

    @Column
    private int price;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "cars")
    private Dealer dealer;

    public Cars(){

    }
    public Cars(String modelName, int price, Dealer dealer) {
        this.modelName = modelName;
        this.price = price;
        this.dealer = dealer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }
}
