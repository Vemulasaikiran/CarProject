package com.example.CarProject.entity;

import javax.persistence.*;

@Entity
@Table(name = "car_details")
public class Dealer {
    @Id

    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private Integer phonenumber;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }
}
