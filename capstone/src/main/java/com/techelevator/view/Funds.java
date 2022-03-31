package com.techelevator.view;

import java.util.ArrayList;
import java.util.List;

public class Funds {

    private double balance;

    double nickels = 0.05;
    double dimes = 0.10;
    double quarter = 0.25;
    double dollar = 1.00;

    public double getBalance() {
        return balance;
    }

    public double deposit(double amountToDeposit) {
        balance += amountToDeposit;
        return balance;
    }

    public double withdrawal(double amountToWithdrawal) {
        balance -= amountToWithdrawal;
        return balance;
    }

    public String refund() {
        int dollarAmt = 0;
        int quarterAmt = 0;
        int dimesAmt = 0;
        int nickelAmt = 0;
        double cents = 0;

        dollarAmt = (int) (balance / dollar);
        cents = balance % dollar;
        quarterAmt = (int) (cents / quarter);
        cents = cents % quarter;
        dimesAmt = (int)(cents/ dimes);
        cents = cents % dimes;
        nickelAmt = (int)(cents / nickels);

        return dollarAmt + " Dollars " + quarterAmt + " Quarters " + dimesAmt + " Dimes " + nickelAmt + " Nickels";

    }

    public static void main(String[] args) {
        Funds money = new Funds();
        money.deposit(5.50);
        money.refund();
        System.out.println(money.refund());
    }

}
