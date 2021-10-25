/**
 * Author: Payam Dowlatyari 
 */
package project1;
import java.io.File;
/**
 * @author payamdowlatyari
 *
 */
//child of FileOptions that searches a file
public class SearchFile extends FileOptions{
	
	private String filename;
	
	SearchFile(String filename){
		super(filename);
		this.filename = filename;
		this.searchFile(this.filename);
	}
	
	void searchFile(String filename) {
		
        FilePath fp = new FilePath();
		File f = new File(fp.getFilePath());
		
		String[] flist = f.list();
	
		int flag = 0;
        if (flist == null) {
            System.out.println("Empty directory.\n");
        }
        else {
  
            // Linear search in the array
            for (int i = 0; i < flist.length; i++) {
                String tempFilename = flist[i];
                if (filename.equalsIgnoreCase(tempFilename)) {
                    System.out.println(filename + " found\n");
                    flag = 1;
                }
            }
        }
  
        if (flag == 0) {
            System.out.println("File Not Found\n");
        }
	
	
	}

}
