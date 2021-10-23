/**
 * Author: Payam Dowlatyari 
 */
package project1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author payamdowlatyari
 *
 */
public class ReadFile {
	
	private String filepath = "/Users/payamdowlatyari/Caltech/Assignments/src/project1/users.txt";
	
	ReadFile() {
		
		 File file = new File(this.filepath);
		 
		 try {
			 
			BufferedReader br = new BufferedReader(new FileReader(file));			
			String st;
			
			while ((st = br.readLine()) != null)		            
		            System.out.println(st); // Print the string
			 
			 br.close();
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	  }
}
