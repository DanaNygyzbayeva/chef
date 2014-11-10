package com.epam.dana.actionMaker;

import com.epam.dana.item.Dressing;
import com.epam.dana.item.Item;
import com.epam.dana.item.Seasoning;
import com.epam.dana.item.Vegetable;
import com.epam.dana.salad.Salad;

import java.util.ArrayList;
import java.util.List;

public class Creator {

    //default constructor
    public Creator() {
    }

    //method to create list of salads
    public List<Salad> createSalad() {

        List<Salad> sd = new ArrayList<Salad>();

        sd.add(new Salad("Ceasar", 650.00, new String[]{"Potato", "Corn", "Mayonnaise", "Salt"}));
        sd.add(new Salad("Olivier", 550.00, new String[]{"Carrot", "Potato", "Olive oil", "Pepper"}));
        sd.add(new Salad("Fresh Salad", 450.00, new String[]{"Beet", "Olive oil", "Salt"}));

        return sd;
    }

    //method to create list of items
    public List createFridge() {

        List<Item> fr = new ArrayList<Item>();

        fr.add(new Vegetable("Carrot", 12.00, 41, 100.00, "Orange", "Fresh"));
        fr.add(new Vegetable("Corn", 15.00, 365, 100.00, "White", "Canned"));
        fr.add(new Vegetable("Potato", 8.00, 77, 100.00, "Brown", "Fresh"));
        fr.add(new Vegetable("Beet", 11.00, 43, 100.00, "Purple", "Fresh"));

        fr.add(new Dressing("Mayonnaise", 22.00, 680, 100.00, "White", 67, "Creamy"));
        fr.add(new Dressing("Olive oil", 60.00, 884, 100.00, "Yellow", 82.5, "Vegetable"));

        fr.add(new Seasoning("Salt", 5.00, 0, 1.00, "White", "Bitter"));
        fr.add(new Seasoning("Pepper", 10.00, 2, 1.00, "Black", "Bitter"));

        return fr;
    }

}
