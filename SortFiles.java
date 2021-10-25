/**
 * Author: Payam Dowlatyari 
 */
package project1;
import java.io.File;
import java.util.Arrays;
/**
 * @author payamdowlatyari
 *
 */
// child of FileOptions that sort an array of files and displays them if not hidden
public class SortFiles extends FileOptions{

	SortFiles(){
		
		FilePath fp = new FilePath();
		File f = new File(fp.getFilePath());
	
		File[] files = f.listFiles();
		
		Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

	      for (File file : files) {
	         if (!file.isHidden()) {
	               System.out.println(file.getName());

	         }
	      }

	}	
	
}
