package com.epam.dana.item;

public class Item implements Comparable<Item> {

    private String name;
    private double price;
    private int calorie;
    private double weight_in_grams;
    private String color;

    //default constructor
    public Item() {
    }

    //constructor
    public Item(String name, double price, int calorie, double weight, String color) {
        this.name = name;
        if (price < 0 || calorie < 0 || weight < 0) {
            throw new IllegalArgumentException("Price, calorie and weight should be positive number!");
        }
        this.price = price;
        this.calorie = calorie;
        weight_in_grams = weight;
        this.color = color;
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

    public int getCalorie() {

        return calorie;
    }

    public void setCalorie(int calorie) {

        this.calorie = calorie;
    }

    public double getWeight() {

        return weight_in_grams;
    }

    public void setWeight(double weight) {

        weight_in_grams = weight;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Item name='%s', price=%s, calorie=%d, weight_in_grams=%s, color='%s' %n", name, price, calorie, weight_in_grams, color);
    }

    @Override
    public int compareTo(Item item) {
        int compareCalorie = ((Item) item).getCalorie();
        //for ascending order
        return this.calorie - compareCalorie;
    }
}



