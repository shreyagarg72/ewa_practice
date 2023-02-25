package org.ncu.finalexam;

import java.util.Comparator;

public class Player  {
	private String name;
	private int score;
	Player(String name, int score){
		super();
		this.name = name;
		this.score = score;
		
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
//	@Override
//	public String toString() {
//		return "Player [name=" + name + ", score=" + score + "]";
//	}
//	@Override

	
}
