package com.techelevator.view;

public class Drinks extends Food{
    public Drinks(String name, double price) {
        super(name, price);
    }

    @Override
    public String message(){
        return "Drinky, Drinky, Slurp Slurp!";
    }

}
