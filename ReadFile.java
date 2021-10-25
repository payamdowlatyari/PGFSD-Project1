/**
 * Author: Payam Dowlatyari 
 */
package project1;
import java.io.File;
/**
 * @author payamdowlatyari
 *
 */
// read name of the files in a given directory
public class ReadFile {
	
	 // creates a new File instance by converting the given path into an abstract path
	 // populates the array with names of files and print the names of files 
	public void listFiles() {
		
		String[] filenames;
       
		FilePath fp = new FilePath();
        File f = new File(fp.getFilePath());
       
        filenames = f.list();

        for (String filename : filenames) {
       
        	if (!filename.equals(".DS_Store"))
            System.out.println(filename);
        }
	}
		
}
