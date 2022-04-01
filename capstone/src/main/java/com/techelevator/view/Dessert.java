package com.techelevator.view;

import java.math.BigDecimal;

public class Dessert extends Food {
    public Dessert(String name, BigDecimal price, String slot) {
        super(name, price, slot);
    }

    @Override
    public String message(){
        return "Sugar, Sugar, so Sweet!";
    }

}
