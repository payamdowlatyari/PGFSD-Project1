/**
 * Author: Payam Dowlatyari 
 */
package project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author payamdowlatyari
 *
 */
public class WriteToFile {
	
	private String filepath = "/Users/payamdowlatyari/Caltech/Assignments/src/project1/users.txt";
	List<String> lines = new ArrayList<String>();
    String line = null;
	
	
	void editUsername(String username, String newUsername) {
		
		
		try {
			
			File f1 = new File(this.filepath);
	        FileReader fr = new FileReader(f1);
	        BufferedReader br = new BufferedReader(fr);
	        while ((line = br.readLine()) != null) {
	            if (line.contains(username))
	                line = line.replace(username, newUsername);
	            lines.add(line);
	        }
	        fr.close();
	        br.close();

	        FileWriter fw = new FileWriter(f1);
	        BufferedWriter out = new BufferedWriter(fw);
	        for(String s : lines)
	             out.write("\n" + s);
	        
	        out.flush();	
	        out.close();
	        Message msg = new Message();
	        msg.displayMessageEdit(username, newUsername);
	        
			} catch (Exception ex) {
	    		ex.printStackTrace();
	    	}
	}
	
	void deleteUsername(String username) {
		try {
			
			File f1 = new File(this.filepath);
	        FileReader fr = new FileReader(f1);
	        BufferedReader br = new BufferedReader(fr);
	        while ((line = br.readLine()) != null) {
	            if (line.contains(username))
	                line = line.replace(username, "");
	            lines.add(line);
	        }
	        fr.close();
	        br.close();

	        FileWriter fw = new FileWriter(f1);
	        BufferedWriter out = new BufferedWriter(fw);
	        for(String s : lines)
	             out.write("\n" + s);
	        out.flush();
			
	        out.close();
	        
	        Message msg = new Message();
	        msg.displayMessageDelete(username);
	        
			} catch (Exception ex) {
	    		ex.printStackTrace();
	    	}
	}
	
	
	void appendUsername(String username) {
		
			try(
		            FileWriter fw = new FileWriter(this.filepath, true);
		            BufferedWriter bw = new BufferedWriter(fw);
		            PrintWriter out = new PrintWriter(bw)
		       )
			
		       {
		         out.println("\n" + username);
		         
		         Message msg = new Message();
			        msg.displayMessageAdd(username);
		       }  
		        catch( IOException ex ){
		        	ex.printStackTrace();
		       }
		 		
		 		       
		 		
		
	}
}
