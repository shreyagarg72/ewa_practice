//reverse the stack
package JavaInClass;
import java.util.*;
import java.util.Scanner;
import java.util.Stack;
public class StackReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="Mary had a little lamb Its fleece was white as snow.";
		String[] word =str.split(" ");
		Stack<String> s=new Stack<>();
		for(int i=0;i<word.length;i++)
		{
			String temp=word[i];
			if(temp.endsWith("."))
			{
				s.push(temp.substring(0,temp.length()-1));
				break;
			}
			else
			{
				s.push(temp);
			}
		}
		
		while(!s.isEmpty())
		{
			System.out.print(s.pop()+" ");
		}
		
		System.out.print(".");
	}
}


