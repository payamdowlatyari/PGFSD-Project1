/**
 * Author: Payam Dowlatyari 
 */
package project1;

import java.io.File;

/**
 * @author payamdowlatyari
 *
 */
public class DeleteFile {
	
	private String filePath = "/Users/payamdowlatyari/Caltech/Assignments/src/project1/";
	
	DeleteFile(String filename){
		
		
		File myObj = new File(this.filePath + filename); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	}
}
