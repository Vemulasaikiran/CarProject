package com.example.CarProject.model;

import java.util.List;

public class DealerModel {
    private String name;
    private String address;
    private long phoneNumber;
    private List<CarsModel> cars;

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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public List<CarsModel> getCars() {
        return cars;
    }

    public void setCars(List<CarsModel> cars) {
        this.cars = cars;
    }
}
