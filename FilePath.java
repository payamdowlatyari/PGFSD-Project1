/**
 * Author: Payam Dowlatyari 
 */
package project1;
/**
 * @author payamdowlatyari
 *
 */
// encapsulates the file path and file name
public class FilePath {
	private String filePath = "/Users/payamdowlatyari/Caltech/Assignments/src/project1/Files/";
	private String filename;
	
	// default constructor
	FilePath(){
		
	}
	
	// parameterized constructor or constructor overloading 
	FilePath(String file){
		this.filename = this.filePath + file;
	}
	
	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
}
