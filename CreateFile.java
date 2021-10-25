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
//child of FileOptions that creates a file
public class CreateFile extends FileOptions{
	
	private String filename;
	
	CreateFile(String filename) {
		
		super(filename);
		this.filename = filename;
		FilePath fp = new FilePath();
		try {
		      File myObj = new File( fp.getFilePath() + this.filename);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName() + "\n");
		      } else {
		        System.out.println("File already exists.\n");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.\n");
		      e.printStackTrace();
		    }
	}
	
}
