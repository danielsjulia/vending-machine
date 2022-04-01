package com.techelevator.view;

import java.math.BigDecimal;

public class Munchy extends Food{

    public Munchy(String name, BigDecimal price, String slot) {
        super(name, price, slot);
    }

    @Override
    public String message(){
        return "Munchy, Munchy, so Good!";
    }

}
