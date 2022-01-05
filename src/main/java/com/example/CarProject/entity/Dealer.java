package com.example.CarProject.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;
import java.security.PrivateKey;

@Entity
@Table(name = "car_details")
public class Dealer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")

    private int id;


    @Column
    private String name;

    @Column
    private String address;

    @Column
    private long phonenumber;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "Cardetails_id")
    private Cars cars;



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

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }
}
