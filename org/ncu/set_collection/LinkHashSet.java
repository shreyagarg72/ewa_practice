package org.ncu.set_collection;
import java.util.*;

public class LinkHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		s1.add(125);
		s1.add(45);
		s1.add(68);
		s1.add(87);
		s1.add(12);
		s1.add(96);
		s1.add(52);
		//optimize
		//time complexity = hashset
		// space complexity = hashset
		System.out.println("elements of set are = "+s1);
		
		
		
	}

}
