package com.example.CarProject.entity;

import com.example.CarProject.model.CarsModel;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "CarDetails_id",referencedColumnName = "id")
    List<Cars> cars= new ArrayList<>();



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

    public List<Cars> getCars(List<CarsModel> carent) {
        return cars;
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }
}
