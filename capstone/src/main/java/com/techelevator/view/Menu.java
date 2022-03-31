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

// to-do -- build out


}
