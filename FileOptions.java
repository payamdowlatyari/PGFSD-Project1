/**
 * Author: Payam Dowlatyari 
 */
package project1;

/**
 * @author payamdowlatyari
 *
 */
public class FileOptions {
	
	protected String filename;
	
	FileOptions(){
		
	}
	
	FileOptions(String filename){
		this.filename = filename;		
	}
	

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}
