package project1;
import java.util.*;

public class Main {	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Welcome welcome = new Welcome();
		welcome.printWelcome();
		
		Menu mainMenu = new Menu();
		mainMenu.displayMenu();
		
		do {			
			String select = input.nextLine();
			mainMenu.selectItem(select);
			
		} while (!mainMenu.exited());
		
		input.close();
	}

}
