package com.techelevator.view;

import java.math.BigDecimal;

public class Munchy extends Food{

    public Munchy(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String message(){
        return "Munchy, Munchy, so Good!";
    }

}
