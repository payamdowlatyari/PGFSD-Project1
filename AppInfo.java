/**
 * Author: Payam Dowlatyari 
 */
package project1;
/**
 * @author payamdowlatyari
 *
 */
// encapsulates the application and its author's information 
// the version of the application can be modified
public class AppInfo {
	
	AppInfo(String version){
		this.version = version;
	}
	
	private String author = "Payam Dowlatyari";
	private String application = "LockedMe.com";
	private String version;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getAuthor() {
		return author;
	}
	public String getApplication() {
		return application;
	}
	

}
