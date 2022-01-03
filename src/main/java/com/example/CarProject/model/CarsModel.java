package com.example.CarProject.model;

import java.util.List;

public class CarsModel {

   private String modelName;
   private List<ColorAndPrice> colorandPrice;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public List<ColorAndPrice> getColorandPrice() {
        return colorandPrice;
    }

    public void setColorandPrice(List<ColorAndPrice> colorandPrice) {
        this.colorandPrice = colorandPrice;
    }
}
