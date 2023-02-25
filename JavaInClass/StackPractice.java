package JavaInClass;
//for(Integer in : stack)//wrapper class
// Queue<String> q = new LinkedList<String>();
import java.util.*;
class StackPractice{
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		String s = "Mary had a little lamb.";
		String arr[] = s.split(" ");
		System.out.println("elements of stack");
		for(int i = 0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
//			string temp = arr[i];
//			if(temp.endswith("."))
//			{
//				temp
//			}
			st.push(arr[i]);
			
		}
		//String arr[];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = st.pop();
		}
		System.out.println("reversed elemnts");
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < arr.length; i++) {
	         sb.append(arr[i]);
	         
	      }	
	      String str = sb.toString();
	      System.out.println(str);
	}
}