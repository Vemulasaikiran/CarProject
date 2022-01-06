package com.example.CarProject.model;

import com.example.CarProject.entity.Cars;

import java.util.List;

public class DealerModel {


    private int id;


    private String name;

    private String address;

    private long phonenumber;
//    private CarsModel cars;
    private List<Cars> cars;






    public DealerModel(int id, String name, String address, long phonenumber, List<Cars> cars) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.cars = cars;
    }



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

    public List<Cars> getCars() {
        return cars;
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }
}
