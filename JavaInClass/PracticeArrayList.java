package JavaInClass;
import java.util.*;
class PracticeArrayList{
	public static void main(String[] args) {
//		ArrayList<String> AL1 = new <String>ArrayList();
//		AL1.add("Ram");
//		AL1.add("lakshman");
//		AL1.add("Bharat");
		//System.out.println(AL1.get(0));
		//System.out.println(AL1.get(2));
//		AL1.set(0, "sh");
//		System.out.println(AL1.get(0));
		Stack<Integer> S1 = new Stack<Integer>();
		//herber sheild
		S1.push(199);
		S1.push(200);
//		System.out.println(S1.peek());// to show the top most element 
//		System.out.println(S1.pop());
//		System.out.println(S1.peek());
		S1.push(290);
		S1.push(300);
		S1.push(800);
		System.out.println(S1.indexOf(800));
		//System.out.println(S1.indexOf(900));
		int i ; 
		Stack<Integer> A1 = new Stack<Integer>();
		for(i=0;i<5;i++) {
			A1.push(S1.pop()+10);
		}
		System.out.println(A1.get(0));
	}
}

