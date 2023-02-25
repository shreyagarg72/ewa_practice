package org.ncu.finalexam;

import java.util.Comparator;

public class scoreCompare implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if(o1.getScore()<o2.getScore()) {
			return -1;
		}
		if(o1.getScore()>o2.getScore()) {return +1;}
		if(o1.getScore()==o2.getScore()) {
			int i = o1.getName().compareToIgnoreCase(o2.getName());
			return i;
			
		}
		
		return 0;
		
		
	}

}
