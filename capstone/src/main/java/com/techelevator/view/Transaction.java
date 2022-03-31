package com.techelevator.view;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private double balance;
    private List<Food> itemSelected = new ArrayList<>();

    public double getBalance() {
        return balance;
    }

    public double deposit(double amountToDeposit) {
        balance += amountToDeposit;
        return balance;
    }

    public void addItem(Food item){ itemSelected.add(item);
    }

    public double withdrawal (){
        double total = 0.00;
        for(Food item : itemSelected){
            total += item.getPrice();
        }
        return balance -= total;
    }






}
