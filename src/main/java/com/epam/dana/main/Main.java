package com.epam.dana.main;

import com.epam.dana.actionMaker.Chef;
import com.epam.dana.actionMaker.Creator;
import com.epam.dana.item.Item;
import com.epam.dana.salad.Salad;
import com.epam.dana.actionMaker.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Creator cr = new Creator();
        Printer pr = new Printer();
        Chef ch = new Chef("John");

        //list of salads created by Creator class and assigned to List salad
        List<Salad> salad = cr.createSalad();
        //list of items created by Creator class and stored in the List fridge
        List<Item> fridge = cr.createFridge();
        //list that stores the ingredients of chosen salad
        List<Item> preparedSalad = new ArrayList<Item>();
        //list that stores the found vegetables which matches with given calorie range
        List<Item> foundVegetables = new ArrayList<Item>();

        String choice;
        String[] content;
        int totalCalorie;

        System.out.println("\nThe list of all Salads: ");
        pr.displaySalad(salad);

        choice = ch.chooseSalad(salad);

        content = ch.getSaladContent(choice, salad);

        ch.makeSalad(content, fridge, preparedSalad);
        System.out.println("\nIngredients used to make the Salad: ");
        pr.displayItem(preparedSalad);

        totalCalorie = ch.calculateCalorie(preparedSalad);
        System.out.println("\nThe total calorie of the Salad: ");
        pr.displayCalorie(totalCalorie);

        System.out.println("\nSorted list of vegetables by calorie: ");
        pr.displayItem(ch.sortByCalorie(fridge));

        foundVegetables = ch.findVegetable(fridge);
        System.out.println("\nFound Vegetables: ");
        pr.displayItem(foundVegetables);
    }
}