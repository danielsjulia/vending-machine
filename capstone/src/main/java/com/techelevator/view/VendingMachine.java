package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class VendingMachine {

    private Map<String, Food> menu = new HashMap<>();

    public VendingMachine() {
        this.stock();
    }

    public void stock() {
        File inputFile = new File("catering1.csv");

        try {
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] lineArr = line.split("\\,");

                String slot = lineArr[0];
                String name = lineArr[1];
                String typeOfFood = lineArr[2];
                double price = Double.parseDouble(lineArr[3]);

                if(typeOfFood.equals("Dessert")){
                    Food item1 = new Dessert (name, price);
                    menu.put(slot, item1);

                } else if (typeOfFood.equals("Drinks")){
                    Food item2 = new Drinks (name, price);
                    menu.put(slot, item2);

                } else if (typeOfFood.equals("Munchy")){
                    Food item3 = new Munchy(name, price);
                    menu.put(slot, item3);

                } else if (typeOfFood.equals("Sandwich")){
                    Food item4 = new Sandwich(name, price);
                    menu.put(slot, item4);
                }

            }
            Set<String> keys = menu.keySet();

            for(String key : keys) {
                System.out.println(key + " " + menu.get(key));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Food> getMenu() {
        return menu;
    }

//    public Food selectItem(String slot) {
//        Food item = new Food();
//        for (Food food : menu) {
//            if (food.getSlot().equals(slot)){
//                item = food;
//            }
//        }
//      return item;
//    }


}
