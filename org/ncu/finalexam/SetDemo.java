package org.ncu.finalexam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br1 = new BufferedReader(new FileReader("C://Users//Shreya Garg//eclipse-workspace//MyFirstProject//src//canvas//words.txt\""));
		BufferedReader br2 = new BufferedReader(new FileReader("C://Users//Shreya Garg//eclipse-workspace//MyFirstProject//src//canvas//dictionary.txt"));
		String line1,line2;
		HashSet<String> hash = new HashSet<String>();
		HashSet<String> hashi = new HashSet<String>();
		while((line1 = br1.readLine())!="") {
			hash.add(line1);
		}
	
	}

}
