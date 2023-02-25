package org.ncu.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapPract {

	public static void main(String[] args) {
		Map<Integer,String> hm = new TreeMap<Integer,String>();
		hm.put(1,"I");
		hm.put(2,"am");

		hm.put(5,"with my");
		hm.put(6,"life");
		hm.put(4,"happy");
		hm.put(3,"very");
		System.out.println(hm);
		// using entryset and keyset
		System.out.println("map of entry objects"+hm.entrySet());//converted into array
		Iterator<Entry<Integer,String>> entry = hm.entrySet().iterator();
		if(entry.hasNext()) {
			System.out.println(hm.values()); // to print values 
			entry.next();
			
		}

	}

}
