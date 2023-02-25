package org.ncu.finalexam;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.push(12);//0 //1
		st.push(33);// 1 //2
		st.push(100);
		st.push(78);
		System.out.println("Top of Element = "+ st.peek());
		st.remove(3);// index value // deletes 78
		st.contains(100); // return true value
		System.out.println(st.search(12)); // position of 12 from top of stack
		System.out.println("Top of Element = "+ st.peek());

	}

}
