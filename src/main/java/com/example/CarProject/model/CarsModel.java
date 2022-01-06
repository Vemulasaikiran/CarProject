package com.example.CarProject.model;

import java.util.List;

public class CarsModel {

    private String modelName;
    private int price;
//   private List<ColorAndPrice> colorandPrice;

    public CarsModel(String modelName, int price) {
        this.modelName = modelName;
        this.price = price;
    }

    public CarsModel() {

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
    //    public List<ColorAndPrice> getColorandPrice() {
//        return colorandPrice;
//    }
//
//    public void setColorandPrice(List<ColorAndPrice> colorandPrice) {
//        this.colorandPrice = colorandPrice;
//    }
}
