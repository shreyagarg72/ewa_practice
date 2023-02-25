package org.ncu.hashdemo;
 
import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner; 
import java.util.Set;
import java.io.BufferedReader;
import java.io.*;

public class SpellChecker {

	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		
//		 
		    try {
		      File myObj = new File("dictionary.txt");
		      Scanner myReader = new Scanner(myObj);
		      Set<String> s = new HashSet<String>();
		      
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		        s.add(data);
		        
		      
		      myReader.close();
		      }
		    
		    
		     
		      try {
			       File myob = new File("words.txt");
			       Scanner myRead = new Scanner(myob);
			       Set<String> s1 = new HashSet<String>();
			       while (myRead.hasNextLine()) {
			             String data = myReader.nextLine();
			             System.out.println(data);
			             s1.add(data);
			   
			       }
			       s.removeAll(s1);
			       myReader.close();
			 
			 //BufferedReader reader = new BufferedReader(new FileReader(file));
		     //String currentLine = reader.readLine();
		   
		    }
		      
			    catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		    }
		   
		   

			 

			 
			 
		    catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    
		  
	
		    
	}
}
	


