package org.ncu.finalexam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MapPract {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C://Users//Shreya Garg//eclipse-workspace//MyFirstProject//src//canvas//words.txt"));
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		String line;
		while((line = br.readLine())!="") {
			String arr[] = line.split(" "); 
			for(int i= 0 ; i<arr.length; i++) {
				String word = arr[i];
				int count= 0;
				if(map.containsKey(word)) {
					map.put(word, count+1);
				}
			}
		}
		System.out.println(map);
		
	}

}
