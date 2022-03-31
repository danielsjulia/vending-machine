package com.techelevator.view;

public abstract class Food {

    private String name;
    private double price;
    private int stock = 7;
    private String slot;

    public Food(String slot, String name, double price) {
        this.slot = slot;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return slot + " " + name + " $" + price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getSlot() {
        return this.slot;
    }
}
