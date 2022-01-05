package com.example.CarProject.model;

public class DealerModel {

    private int id;


    private String name;

    private String address;

    private long phonenumber;
    private CarsModel cars;
//    private List<CarsModel> cars;


    public DealerModel(int id, String name, String address, long phonenumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
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

    public CarsModel getCars() {
        return cars;
    }

    public void setCars(CarsModel cars) {
        this.cars = cars;
    }
}
