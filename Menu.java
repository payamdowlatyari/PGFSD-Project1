/**
 * Author: Payam Dowlatyari 
 */
package project1;
import java.util.*;
/**
 * @author payamdowlatyari
 *
 */
public class Menu {
	
	ArrayList <String> menuItems;
	private boolean validSelection = true;
	private boolean exit = false;
	
	Menu(){	
		
		this.menuItems = new ArrayList<String>();
		
		this.menuItems.add("1. Display users");
		this.menuItems.add("2. Add a user");
		this.menuItems.add("3. Edit a user");
		this.menuItems.add("4. Delete a user");
		this.menuItems.add("5. Sort users");
		this.menuItems.add("6. Search for a user");
		this.menuItems.add("7. Exit");
	}
	
	void displayMenu() {

		this.menuItems.forEach((n) -> System.out.println(n));
		System.out.println(" \nPlease choose a number from the list");
	}
	
	void selectItem(String item) {
		
		Scanner input = new Scanner(System.in);
		Message msg = new Message();
		
		switch(item) {
		
		case "1": {
			
			validSelection = true;
			System.out.println("List of the users:\n");
			new ReadFile();	
		}
			break;
		case "2": {
			
			validSelection = true;
			System.out.println("Enter username");
			String username = input.nextLine();
			WriteToFile wtf = new WriteToFile();
			wtf.appendUsername(username);			
		}
			break;
		case "3": {
			
			validSelection = true;
			System.out.println("Enter username");
			String username = input.nextLine();
			System.out.println("Enter new username");
			String newUsername = input.nextLine();
			WriteToFile wtf = new WriteToFile();
			wtf.editUsername(username, newUsername);
		}
			break;
		case "4": {
			
			validSelection = true;
			System.out.println("Enter username");
			String username = input.nextLine();
			WriteToFile wtf = new WriteToFile();
			wtf.deleteUsername(username);
		}
			break;
		case "5": {
			
			validSelection = true;
			System.out.println("Ascending or Descending sort? (a/d) ");
			String order = input.nextLine();
			new SortUser(order);		
		}
			break;
		case "6": {
			
			validSelection = true;
			System.out.println("Enter username");
			String username = input.nextLine();
			SearchUser srch = new SearchUser();
			msg.displayMessageSearch(username, srch.searchUsername(username));		
		}
			break;
		case "7": {
			System.out.println("Goodbye!");
			validSelection = true;
			exit = true;
			input.close();
		}
			break;
		default: {
			System.out.println( "Try again!");
			validSelection = false;
		}
			break;
		}

	}
	
	public boolean selected () {
		return this.validSelection;
	}
	
	public boolean exited () {
		return this.exit;
	}

}
