package com.techelevator.view;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funds {

    private BigDecimal balance = new BigDecimal("0.00");

    int nickels = 5;
    int dimes = 10;
    int quarter = 25;
    int dollar = 100;


    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amountToDeposit) {
        balance = balance.add(amountToDeposit);
    }

    public void withdrawal(BigDecimal amountToWithdrawal) {
        balance = balance.subtract(amountToWithdrawal);
    }

    public void refund() {
        int dollarAmt = 0;
        int quarterAmt = 0;
        int dimesAmt = 0;
        int nickelAmt = 0;
        int cents;

        BigDecimal balanceInCents = this.balance.multiply(new BigDecimal("100.00"));

        int intBalance = balanceInCents.intValue();
        dollarAmt = intBalance / dollar;
        cents = intBalance % dollar;
        quarterAmt = cents / quarter;
        cents = cents % quarter;
        dimesAmt = cents/ dimes;
        cents = cents % dimes;
        nickelAmt = cents / nickels;

        System.out.println("Your change is: " + dollarAmt + " Dollars " + quarterAmt + " Quarters " + dimesAmt + " Dimes " + nickelAmt + " Nickels");

    }

}
