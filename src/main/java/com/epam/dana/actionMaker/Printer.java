package com.epam.dana.actionMaker;

import com.epam.dana.item.Item;
import com.epam.dana.salad.Salad;

import java.util.List;

public class Printer {

    //default constructor
    public Printer() {
    }

    //method to print the list of salads
    public void displaySalad(List<Salad> sd) {

        for (Salad salad : sd) {
            System.out.print(salad);
        }
    }

    //method to print list of items
    public void displayItem(List<Item> item) {

        for (Item it : item) {
            System.out.print(it);
        }
    }

    //method to print a calorie
    public void displayCalorie(int calorie) {
        System.out.println(calorie);
    }
}
