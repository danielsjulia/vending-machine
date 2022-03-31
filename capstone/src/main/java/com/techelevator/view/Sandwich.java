package com.techelevator.view;

public class Sandwich extends Food{

    public Sandwich(String name, double price) {
        super(name, price);
    }

    @Override
    public String message(){
        return "Sandwich So Delicious, Yum!";
    }
}
