package org.ncu.maps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//import java.util.TreeMap;

public class P9 {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		Map<String, Integer> hm = new HashMap<>();
		File file = new File("C://Users//Shreya Garg//eclipse-workspace//MyFirstProject//src//org//ncu//maps//","alice.txt");
		Scanner sc = new Scanner(file);
		while( sc.hasNext() ) { 
				String word = sc.next().toLowerCase();
				
				String w = "";
				
				for(int i = 0; i < word.length(); i++) {
					char c = word.charAt(i);
					if(Character.isLetter(c))
							w = w + c;
				}
				int count = 0;
				// Get the old frequency count mapped to given key
				if(hm.containsKey(w)) {
					 count = hm.get(w);
					
					// If there was none put 1; otherwise, increment the count
					if (count == 0) {
						count = 1; 
					}
					else { 
						count = count + 1;
					}
					hm.put(w, count);
				}
				else {
					count = 1;
					hm.put(w, count);
				}
									
		}
		// Print all words and counts
		for (String key : hm.keySet()) {
			System.out.printf("%-20s%10d\n", key, hm.get(key));
		}
		sc.close();
	}

}
