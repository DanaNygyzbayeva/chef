package com.epam.dana.item;

public class Seasoning extends Item {

    String flavour;

    public Seasoning() {
    }

    public Seasoning(String name, double price, int calorie, double weight, String color, String flavour) {
        super(name, price, calorie, weight, color);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
