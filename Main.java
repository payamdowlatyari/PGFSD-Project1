// Author: Payam Dowlatyari 
package project1;
/**
 * @author payamdowlatyari
 *
 */
public class Main {	
	
	// the main method creates an instance of Welcome and mainMenu objects 
	// prints the welcome messages and displays the main menu
	public static void main(String[] args) {
				
		Welcome welcome = new Welcome();
		welcome.printWelcome();
		
		Menu mainMenu = new Menu();
		mainMenu.displayMenu();
		
	}

}
