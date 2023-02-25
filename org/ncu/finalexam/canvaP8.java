package org.ncu.finalexam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class canvaP8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Player> arr = new ArrayList<Player>();
		Player p1 = new Player("Shreya" , 100);
		Player p2 = new Player("avnee" , 400);
		Player p3 = new Player("ritika" , 500);
		Player p4 = new Player("Rahul" , 130);
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		System.out.println(arr);
		scoreCompare sc = new scoreCompare();
		Collections.sort(arr,sc);
	    for(int i=0;i<arr.size();i++){
	    	System.out.println("score"+arr.get(i).getScore()+"Name = "+arr.get(i).getName());
	     }
//		Collection.sort(arr,sc);
		
		
		
		
		
	}

}
