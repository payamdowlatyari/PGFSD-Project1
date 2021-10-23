/**
 * Author: Payam Dowlatyari 
 */
package project1;

/**
 * @author payamdowlatyari
 *
 */
public class Welcome {
	
	AppInfo myApp = new AppInfo("1.0");
	
	void printWelcome() {
		System.out.println("**********************************************\n");
		System.out.println(" Welcome to " + myApp.getApplication() + " Version " + myApp.getVersion());
		System.out.println(" Author: " + myApp.getAuthor() + "\n");
		System.out.println("**********************************************\n");

		
	}
	

}
