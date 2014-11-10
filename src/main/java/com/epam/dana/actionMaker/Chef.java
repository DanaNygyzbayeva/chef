package com.epam.dana.actionMaker;

import com.epam.dana.item.Item;
import com.epam.dana.item.Vegetable;
import com.epam.dana.salad.Salad;

import java.util.*;


public class Chef {

    String name;

    //default constructor
    public Chef() {
    }

    //constructor
    public Chef(String name) {

        this.name = name;
    }

    //method to choose a salad from the list of salads
    public String chooseSalad(List<Salad> salads) {

        Scanner in = new Scanner(System.in);
        boolean check = false;
        String input = "Unknown";

        while (!check) {
            System.out.println("\nEnter the Salad name that you want to prepare: ");
            input = in.nextLine();
            for (Salad sd : salads) {
                if (input.equals(sd.getName())) {
                    System.out.println("\nYou choice is Salad: " + input);
                    check = true;
                }
            }
        }
        return input;
    }

    //method to get the content of chosen salad
    public String[] getSaladContent(String saladName, List<Salad> salads) {

        String content[] = {};
        for (Salad sd : salads) {
            if (saladName.equals(sd.getName())) {
                content = sd.getContent();
                System.out.println("\nIngredients that you need: " + Arrays.deepToString(content));
            }
        }
        return content;
    }

    //method to get the salad ingredients from the fridge
    public List<Item> makeSalad(String[] content, List<Item> fridge, List<Item> preparedSalad) {

        for (int i = 0; i < content.length; i++) {
            for (Item fr : fridge) {
                {
                    if (content[i].equals(fr.getName())) {
                        preparedSalad.add(fr);
                    }
                }
            }
        }
        return preparedSalad;
    }

    //method to calculate the calorie of the salad
    public int calculateCalorie(List<Item> preparedSalad) {
        int calorie = 0;

        for (Item salad : preparedSalad) {
            calorie += salad.getCalorie();
        }
        return calorie;
    }

    //method to sort vegetables by calorie
    public List<Item> sortByCalorie(List<Item> fridge) {
        List<Item> fridgeOfVegetables = new ArrayList<Item>();

        for (Item item : fridge) {
            if (item instanceof Vegetable) {
                fridgeOfVegetables.add(item);
            }
        }
        Collections.sort(fridgeOfVegetables);
        return fridgeOfVegetables;
    }

    //method to find the vegetables according to given calorie range
    public List<Item> findVegetable(List<Item> fridge) {
        Scanner in = new Scanner(System.in);

        List<Item> foundVegetables = new ArrayList<Item>();
        System.out.println("\nPlease enter the minimum calorie of Vegetables that you want to find: ");
        int min = in.nextInt();
        System.out.println("Please enter the maximum calorie of Vegetables that you want to find: ");
        int max = in.nextInt();

        for (Item item : fridge) {
            if ((item instanceof Vegetable) && (item.getCalorie() > min & item.getCalorie() < max)) {
                foundVegetables.add(item);
            }
        }
        return foundVegetables;
    }
}
