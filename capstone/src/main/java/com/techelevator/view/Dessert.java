package com.techelevator.view;

public class Dessert extends Food {
    public Dessert(String name, double price) {
        super(name, price);
    }

    @Override
    public String message(){
        return "Sugar, Sugar, so Sweet!";
    }

}
