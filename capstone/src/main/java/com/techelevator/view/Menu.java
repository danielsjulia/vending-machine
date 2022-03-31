package com.techelevator.view;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;


public class Menu {

public void levelOne(){
    System.out.println("(D) Display caTEring Items\n(P) Purchase\n(E) Exit");
}

public void levelOneSubD(){
    VendingMachine vendingMachine = new VendingMachine();
    System.out.println(vendingMachine);
}

public void levelOneSubP(){
    System.out.println("(M) Feed Money\n(S) Select Item\n(F) Finish Transaction");
    // running total
}

public void subM(){
    System.out.println("(1) $1\n(2) $5\n(3) $10\n(4) $20\n(5) Back");
}

// to-do -- build out


}
