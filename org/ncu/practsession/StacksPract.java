package org.ncu.practsession;

import java.util.*;
import java.lang.*;


public class StacksPract {

	public static void main(String[] args) {
		Stack<String> str = new Stack<String>();
		String s = "Mary had a little lamb. Its fleece was white as snow.";
		StringBuilder sb = new StringBuilder();
//	    String arr[];
//	    arr = s.split(" ");
//	    for(int i = 0; i< arr.length;i++) {
//	    	System.out.println(arr[i]);
//	    	str.push(arr[i]); // the string is made into the stack
		
	    	
	  //  }
		for(String sent : s.split("\\.\\s*")) {
			str.clear();
			for(String words : s.split(" \\s+")) {
				str.push(words.toLowerCase());
			}
			boolean first = true ;
			while(!str.empty()) {
				String word = str.pop();
				if(first) {
					first  = false;
					word = word.substring(0, 1).toUpperCase()+word.substring(1);
					
				}
				if(sb.length()>0) {
					sb.append(' ');
				}
				sb.append(word);
			}
			sb.append('.');
		
			
		}
		System.out.println(sb);
		
	    

	}

}
