/**
 * Author: Payam Dowlatyari 
 */
package project1;
import java.util.*;
/**
 * @author payamdowlatyari
 *
 */
// this class handles all menu and sub menu options 
public class Menu {
	
	ArrayList <String> menuItems; // contains main menu
	ArrayList <String> options; // contains more options or sub menu
	
	private boolean exit;
	
	// constructor instantiates menu and sub menu items 
	Menu(){	
		
		this.menuItems = new ArrayList<String>();		
		this.menuItems.add("(1) Display files ");
		this.menuItems.add("(2) More Options ");
		this.menuItems.add("(exit) Exit the program ");
		
		this.options = new ArrayList<String>();
		this.options.add("(3) Add a new file ");
		this.options.add("(4) Delete a user file ");
		this.options.add("(5) Search a user file ");
		this.options.add("(0) Main Menu ");
		this.options.add("(exit) Exit the program ");
		
		this.exit = false;
	}
	
	// this method gets input from the console and uses a while loop to display the menu
	void displayMenu() {
		
		Scanner input = new Scanner(System.in);
		
		while(!this.exited()) {

		System.out.println("**********************************************\n");	
		this.menuItems.forEach((n) -> System.out.println(n));
		System.out.println(" \nChoose from the menu\n");
		System.out.println("**********************************************\n");
		this.selectItem(input.nextLine());

		}
		
		if (this.exited())
			input.close();
		
	}
	
	// displays the sub menu using function overloading 
	void displayMenu(ArrayList<String> menu) {

		System.out.println("**********************************************\n");
		menu.forEach((n) -> System.out.println(n));
		System.out.println(" \nChoose an options\n");
		System.out.println("**********************************************\n");
	}
	
	// uses a switch statement to handle users selection 
	void selectItem(String item) {
		
		Scanner input = new Scanner(System.in);
		
		switch(item) {
		
		case "1": {
			
			new SortFiles();
		}
			break;
		case "2": {
			
			this.displayMenu(options);
			String option = input.nextLine();
			this.selectItem(option);
		}
			break;

		case "3": {
			
			System.out.println("Enter new file name");
			String filename = input.nextLine();
			new CreateFile(filename);

		}
			break;
		case "4": {
					
			System.out.println("Enter file name");
			String filename = input.nextLine();
			new DeleteFile(filename); 
				
		}
			break;
		case "5": {
			
			System.out.println("Enter file to search");
			String filename = input.nextLine();
			new SearchFile(filename);
		}
			break;
		case "0": {
			
			this.displayMenu();
		}
			break;
		case "exit": {
			
			System.out.println("You have exited. Goodbye!\n");
			exit = true;
			input.close();
		}
			break;	
		default: {
			
			System.out.println( "Try again!\n");
			this.displayMenu();
		}
			break;
		
		}

	}
	
	// exits the program
	public boolean exited () {
		return this.exit;
	}

}
