package org.ncu.practsession;

import java.util.*;

public class QueueDemo{
	public static void main(String[] args)  {
		Stack<Integer> driveway = new Stack<Integer>();
		Queue<Integer> street = new LinkedList<Integer>();
		driveway.push(2300);
		driveway.push(2932);
		driveway.push(3456);
		driveway.push(1289);
		driveway.push(3409);
		try (Scanner sc = new Scanner(System.in)) {
			int car = sc.nextInt();
			Iterator<Integer> itr = driveway.iterator();
			while(itr.hasNext()) {
//			street.add((Integer) itr.next());
				while(!(driveway.contains(car))){
//				street.add((Integer) itr.next());
					int s = driveway.pop();
					System.out.println(s);
					street.add(s);
				
					
				}
				
			}
//		for(int i = 0 ; i< driveway.size();i++) {
//			if(driveway.) {
//				
//			}
//		}
		}
		catch(Exception e) {
			System.out.println("error");
		}
	}
}