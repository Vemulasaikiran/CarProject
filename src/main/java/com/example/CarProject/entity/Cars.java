package com.example.CarProject.entity;

import javax.persistence.*;

@Entity
@Table(name = "CarsPrice")
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String model;
    @Column
    private int price;

    public Cars(){

    }
    public Cars(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
