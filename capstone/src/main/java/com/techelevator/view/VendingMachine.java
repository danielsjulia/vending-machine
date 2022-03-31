package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

    private List<Food> menu = new ArrayList<>();

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
                    Food item1 = new Dessert (slot, name, price);
                    menu.add(item1);

                } else if (typeOfFood.equals("Drinks")){
                    Food item2 = new Drinks (slot, name, price);
                    menu.add(item2);

                } else if (typeOfFood.equals("Munchy")){
                    Food item3 = new Munchy(slot, name, price);
                    menu.add(item3);

                } else if (typeOfFood.equals("Sandwich")){
                    Food item4 = new Sandwich(slot, name, price);
                    menu.add(item4);
                }

            }

            String menuString = "";

            for (Food food : menu) {
                menuString += food + "\n";
            }

            System.out.println(menuString);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
