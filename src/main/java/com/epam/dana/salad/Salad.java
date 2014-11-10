package com.epam.dana.salad;

import java.util.Arrays;

public class Salad {

    String name;
    double price;
    private String content[];

    //default constructor
    public Salad() {
    }

    //constructor
    public Salad(String name, double price, String[] content) {
        this.name = name;
        this.price = price;
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("Salad name=%s, price=%s, content=%s %n", name, price, Arrays.toString(content));

    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String[] getContent() {

        return content;
    }

    public void setContent(String[] content) {

        this.content = content;
    }
}





