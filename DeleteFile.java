/**
 * Author: Payam Dowlatyari 
 */
package project1;
import java.io.File;
/**
 * @author payamdowlatyari
 *
 */
// child of FileOptions that deletes a file
public class DeleteFile extends FileOptions{
		
	private String filename;
		
	DeleteFile(String filename){
		
		super(filename);
		this.filename = filename;
		FilePath fp = new FilePath();
		
		File myObj = new File(fp.getFilePath() + this.filename); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	}
}
