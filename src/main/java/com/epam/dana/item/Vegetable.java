package com.epam.dana.item;

public class Vegetable extends Item {

    String storage_type;

    //default constructor
    public Vegetable() {
    }

    //constructor
    public Vegetable(String name, double price, int calorie, double weight, String color, String storage_type) {
        super(name, price, calorie, weight, color);
        this.storage_type = storage_type;
    }

    public String getStorageType() {

        return storage_type;
    }

    public void setStorageType(String storage_type) {

        this.storage_type = storage_type;
    }
}
