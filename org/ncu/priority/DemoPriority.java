package org.ncu.priority;
import java.util.*;
public class DemoPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pq = new PriorityQueue<String>();
		pq.add("ironMan");
		pq.add("spiderman");
		pq.add("batman");
		pq.add("captain");
		pq.add("superman");
		pq.add("thor");
		pq.add("deadpool");
		pq.add("dr.strange");

		System.out.println("elements in queue:"+pq);
		System.out.println("element in hp priority:"+pq.poll());

	}

}
