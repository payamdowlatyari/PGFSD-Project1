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
	
	private String filepath = "/Users/payamdowlatyari/Caltech/Assignments/src/project1/users.txt";
	public String order; 
	public List<String> users;
	String user = null;
	
	SortUser(String order){
		
		this.order = order;
		this.users = new ArrayList<String>(); 
		
		File f1 = new File(this.filepath);
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
       
		if (this.order == "d") 
			this.descending();
		
		else
			this.ascending();	
	}
	
	void ascending() {
		
		Collections.sort(this.users);  
		Message msg = new Message();
		msg.displayUsers(this.users);		
	}
	
	void descending() {
		
		Collections.sort(this.users, Collections.reverseOrder());  
		Message msg = new Message();
		msg.displayUsers(this.users);
	}		
}
