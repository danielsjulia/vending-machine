package com.techelevator.view;

import java.math.BigDecimal;

public class Drinks extends Food{
    public Drinks(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String message(){
        return "Drinky, Drinky, Slurp Slurp!";
    }

}
