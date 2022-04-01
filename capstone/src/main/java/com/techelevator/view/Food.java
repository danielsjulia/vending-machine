package com.techelevator.view;

import java.math.BigDecimal;

public abstract class Food {

    private String name;
    private BigDecimal price;
    private int stock = 7;
    private String slot;

    public Food(String name, BigDecimal price, String slot) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.slot = slot;
    }

    @Override
    public String toString() {
        return name + " $" + price;
    }

    public abstract String message();

    public void removeItem(int num){
        stock -= num;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getSlot() {
        return this.slot;
    }
}
