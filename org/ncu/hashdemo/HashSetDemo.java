package org.ncu.hashdemo;
import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		//create a hashset object
		HashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("Teasla");
		set1.add("Suzuki");
		set1.add("Mahindra");
		set1.add("Tata");
		set1.add("Hyundai");
		set1.add("Toyota");
		System.out.println("set of cars"+set1);
		
		
	}
}
