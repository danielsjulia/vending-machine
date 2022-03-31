package com.techelevator.view;

public class Munchy extends Food{

    public Munchy(String name, double price) {
        super(name, price);
    }

    @Override
    public String message(){
        return "Munchy, Munch, so Good!";
    }

}
