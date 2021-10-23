/**
 * Author: Payam Dowlatyari 
 */
package project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author payamdowlatyari
 *
 */
public class SearchUser {
	private String filepath = "/Users/payamdowlatyari/Caltech/Assignments/src/project1/users.txt";
	List<String> lines = new ArrayList<String>();
    String line = null;
   
    private boolean found;
    
    SearchUser(){
    	this.found = false;
    }
	
	boolean searchUsername(String username) {
		
			try {
			
			File f1 = new File(this.filepath);
	        FileReader fr = new FileReader(f1);
	        BufferedReader br = new BufferedReader(fr);
	        while ((line = br.readLine()) != null) {
	            if (line.contains(username))
	                this.found =  true;
	            lines.add(line);
	        }
	        
	        fr.close();
	        br.close();

	        FileWriter fw = new FileWriter(f1);
	        BufferedWriter out = new BufferedWriter(fw);
	        for(String s : lines)
	             out.write(s);
	        out.flush();
			
	        out.close();
	        
			} catch (Exception ex) {
	    		ex.printStackTrace();
			}
			
			return this.found;
	}

}

