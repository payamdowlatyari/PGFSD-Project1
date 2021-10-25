/**
 * Author: Payam Dowlatyari 
 */
package project1;
import java.util.List;
/**
 * @author payamdowlatyari
 *
 */
public class Message {

	public void displayUsers(List<String>users) {
		System.out.println(users);
	}

	public void displayMessageEdit(String word1, String word2) {
		
		System.out.println("You edited " + word1 + " to " + word2);
	}
	
	public void displayMessageDelete(String word) {
		
		System.out.println("You deleted " + word);
	}


	public void displayMessageAdd(String word) {
	
		System.out.println("You Added " + word);
	}
	
	public void displayMessageSort(String word) {
		// TODO Auto-generated method stub
		System.out.println("Sorted list of users " + word);
	}
	
	public void displayMessageSearch(String word, boolean found) {
		
		if (found) {
			System.out.println(word + " Exists!");
		}
		else {
			System.out.println(word + " does not exist!");
		}
		
	}
	
}