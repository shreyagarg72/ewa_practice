package org.ncu.maps;

import java.util.Map;
//import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class InClassExerciseP7 {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		map.put("john","A");
		map.put("carter","C");
		map.put("ron","B+");
		map.put("hermoine","A+");
		map.put("harry","B");
		map.put("malfoy","D");
		System.out.println("Choose the number");
		System.out.println("1.Add data");
		System.out.println("2.Remove data");
		System.out.println("3.modify grades data");
		System.out.println("4.print all data");
		int choice = sc.nextInt();
		if(choice==1) {
			
			System.out.println("Enter student name:");
            String stuName = sc.nextLine();
            if (map.containsKey(stuName)) {
                System.out.println("Student name already present.");
                //continue;
            }   
            else {
            	String name = sc.next();
            	String grade = sc.next();
            	map.put(name, grade);
            	System.out.println("updated values");
    			for(Entry<String,String> entry : map.entrySet()){
    				System.out.println(entry);
    			}
            }
            
		}
		if(choice==2) {
			System.out.println("enter name to be removed");
			String name = sc.next();
			map.remove(name);
			System.out.println("updated values");
			System.out.println("key inside hash map"+map.keySet());
		}
		if(choice== 3) {
			System.out.println("enter key to be updated");
			String name = sc.next();
			String grade = sc.next();
			map.replace(name,grade );
			System.out.println("updated values");
			for(Entry<String,String> entry : map.entrySet()){
				System.out.println(entry);
			}
			
		}
		if(choice==4) {
			for(Entry<String,String> entry : map.entrySet()){
				System.out.println(entry);
			}
		}
           
		
	}

	
}

