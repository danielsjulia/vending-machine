package com.techelevator.view;

import java.math.BigDecimal;

public class Sandwich extends Food{

    public Sandwich(String name, BigDecimal price, String slot) {
        super(name, price, slot);
    }

    @Override
    public String message(){
        return "Sandwich So Delicious, Yum!";
    }
}
