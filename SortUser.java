/**
 * Author: Payam Dowlatyari 
 */
package project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author payamdowlatyari
 *
 */
public class SortUser {
	
	public List<String> users;
	String user = null;
	
	SortUser(){
		
		this.users = new ArrayList<String>(); 
		FilePath fp = new FilePath("users.txt");
		
		File f1 = new File(fp.getFilename());
        FileReader fr;
        
		try {
			fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			while ((user = br.readLine()) != null) {
			   
				this.users.add(user);
			}
			 fr.close();
		     br.close();
		     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
			this.ascendingSort();	
	}
	
	void ascendingSort() {
		
		Collections.sort(this.users);  
		Message msg = new Message();
		msg.displayUsers(this.users);		
	}
	
}
