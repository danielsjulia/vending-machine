package com.techelevator.view;

import java.math.BigDecimal;

public class Drinks extends Food{
    public Drinks(String name, BigDecimal price, String slot) {
        super(name, price, slot);
    }

    @Override
    public String message(){
        return "Drinky, Drinky, Slurp Slurp!";
    }

}
