package com.techelevator;

import com.techelevator.view.Menu;

import java.util.Scanner;

public class CaTEringCapstoneCLI {

	private Menu menu;
	private Scanner inputScanner;

	public CaTEringCapstoneCLI(Menu menu) {
		this.menu = menu;
		this.inputScanner = new Scanner(System.in);
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
			String level1Input = inputScanner.nextLine();

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
			String levelPInput = inputScanner.nextLine();

			if (levelPInput.equals("M")) {
				// feed money
			} else if (levelPInput.equals("S")) {
				// select item
			} else if (levelPInput.equals("F")) {
				// exit
				keepGoing = false;
			}

		} while (keepGoing);
	}
}
