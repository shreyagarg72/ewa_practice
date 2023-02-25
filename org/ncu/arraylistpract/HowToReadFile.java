package org.ncu.arraylistpract;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class HowToReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("C://Users//Shreya Garg//eclipse-workspace//MyFirstProject//src//org//ncu//arraylistpract//words.txt"));
			ArrayList<String> ar = new ArrayList<String>();
			String line = br.readLine();
			while(line!= null) {
				ar.add(line);
				line = br.readLine();
			}
			System.out.println("the file is read and added in arraylist");
			System.out.println(ar);
			Iterator<String> itr = ar.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+",");
				
			}
			// traversal in reverse direction 
			System.out.println("");
			ListIterator<String> litr = ar.listIterator(ar.size());
			while(litr.hasPrevious()) {
				System.out.print(litr.previous()+",");
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
