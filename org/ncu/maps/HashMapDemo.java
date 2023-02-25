package org.ncu.maps;

import java.util.HashMap;
import java.util.Iterator;
//import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1001, "john");
		map.put(1005, "carter");
		map.put(1078, "ron");
		map.put(1012, "hermoine");
		map.put(1008, "harry");
		map.put(1010, "malfoy");
		map.put(1089, null);
		
		System.out.println("elements inside Hashmap = "+ map);
		//using hash table = the order it followed is the order its put in table
		map.entrySet();// convert map into array in entry objects array
		//tostring = data in string form 
		//16 buckets in hash table
		//iterator is used in single value
		// convert into entry set // convert to entry objects
		
		System.out.println("map of entry objects"+map.entrySet());//convert into array
		Iterator<Entry<Integer,String>> itr = map.entrySet().iterator();//takes single value but takes entry objects
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}
		System.out.println("key inside hash map"+map.keySet());
		System.out.println("values inside hash map"+map.values());
		for(Entry<Integer,String> entry : map.entrySet()){
			System.out.println(entry);
		}
		
		}
//	for(String str: obj) {
//		System.out.println(str);
//	}

}
