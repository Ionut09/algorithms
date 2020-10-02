package com.lseg.composition;

public abstract class Component {//singurul scop in viata al unei clase abstracte este sa fie extinsa

    private String manufacturer;

    private String model;

    public Component(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
