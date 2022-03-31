package com.techelevator;

import com.techelevator.view.Food;
import com.techelevator.view.Menu;
import com.techelevator.view.Transaction;
import com.techelevator.view.VendingMachine;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class CaTEringCapstoneCLI {

    private Menu menu;
    private Scanner inputScanner;
    private Transaction balance;
    private VendingMachine vendingMachine;

    public CaTEringCapstoneCLI(Menu menu) {
        this.menu = menu;
        this.inputScanner = new Scanner(System.in);
        this.balance = new Transaction();
//        this.vendingMachine = new VendingMachine();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        CaTEringCapstoneCLI cli = new CaTEringCapstoneCLI(menu);
        cli.run();
    }

    public void run() {
        boolean keepGoing = true;

        do {
            //  to do -- build out main menu
            this.menu.levelOne();
            String level1Input = inputScanner.nextLine().toUpperCase();

            if (level1Input.equals("D")) {
                // display items
                this.menu.levelOneSubD();
            } else if (level1Input.equals("P")) {
                // make a purchase
                subP();
            } else if (level1Input.equals("E")) {
                // exit
                keepGoing = false;
            }
        } while (keepGoing);
    }

    public void subP() {
        boolean keepGoing = true;
        do {
            this.menu.levelOneSubP();
            String levelPInput = inputScanner.nextLine().toUpperCase();

            if (levelPInput.equals("M")) {
                subM();
            } else if (levelPInput.equals("S")) {
//                subS();
            } else if (levelPInput.equals("F")) {
                // exit
                keepGoing = false;
            }

        } while (keepGoing);
    }

    public void subM() {
        boolean keepGoing = true;
        System.out.println(balance.getBalance());
        do {
            this.menu.subM();
            String levelMInput = inputScanner.nextLine().toUpperCase();

            if (levelMInput.equals("1")) {
                // Add $1
                balance.deposit(1);
            } else if (levelMInput.equals("2")) {
                // Add $5
                balance.deposit(5);
            } else if (levelMInput.equals("3")) {
                // Add $10
                balance.deposit(10);
            } else if (levelMInput.equals("4")) {
                // Add $20
                balance.deposit(20);
            } else if (levelMInput.equals("5")) {
                keepGoing = false;
            }
            System.out.println(balance.getBalance());

        } while (keepGoing);
    }

//    public void subS() {
//        boolean keepGoing = true;
//
//        do {
//            this.menu.levelOneSubD();
//            String levelSInput = inputScanner.nextLine().toUpperCase();
//            if (levelSInput != "Q") {
//                for (Food item : vendingMachine.getMenu()) {
//                    if (levelSInput.contains(item.getSlot()) && item.getStock() != 0) {
//                        balance.addItem(item);
//                        balance.withdrawal();
//                        System.out.println(item.getName() + " $" + item.getPrice() + " $" + balance.getBalance());
//                    }
//                    else if (item.getStock() == 0){
//                        System.out.println("NO LONGER AVAILABLE");
//                        keepGoing = false;
//                    } else {
//                        System.out.println("Item does exist");
//                        keepGoing = false;
//                    }
//                }
//                System.out.println(balance.getBalance());
//                keepGoing = false;
//            }
//        } while (keepGoing);
//    }
}
