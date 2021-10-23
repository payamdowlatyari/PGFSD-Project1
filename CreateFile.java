/**
 * Author: Payam Dowlatyari 
 */
package project1;

import java.io.File;
import java.io.IOException;

/**
 * @author payamdowlatyari
 *
 */
public class CreateFile {
	private String filePath = "/Users/payamdowlatyari/Caltech/Assignments/src/project1/";
	private String filename;
	
	CreateFile(String filename) {
		this.filename = filename;
		try {
		      File myObj = new File( this.filePath + this.filename);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
}
