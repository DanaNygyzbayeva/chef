package com.epam.dana.item;

public class Dressing extends Item {


    private double fattiness;
    String origin;

    public Dressing() {
    }

    public Dressing(String name, double price, int calorie, double weight, String color, double fattiness, String origin) {
        super(name, price, calorie, weight, color);
        this.fattiness = fattiness;
        this.origin = origin;
    }

    public double getFattiness() {
        return fattiness;
    }

    public void setFattiness(double fattiness) {
        this.fattiness = fattiness;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
