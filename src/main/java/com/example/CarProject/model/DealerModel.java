package com.example.CarProject.model;
import java.util.List;

public class DealerModel {

    private int id;


    private String name;

    private String address;

    private Integer phonenumber;
//    private List<CarsModel> cars;


    public DealerModel(int id, String name, String address, Integer phonenumber) {
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

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    //
//    public List<CarsModel> getCars() {
//        return cars;
//    }
//
//    public void setCars(List<CarsModel> cars) {
//        this.cars = cars;
//    }


}
