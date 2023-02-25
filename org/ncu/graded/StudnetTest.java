package org.ncu.graded;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;




public class StudnetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no. of records you want?");
		Scanner sc = new Scanner(System.in);
		int records = sc.nextInt();
		List<StudentDetails> sd = new ArrayList<StudentDetails>();
		while(records>0) {
			System.out.println("enter the id");
			int id = sc.nextInt();
			System.out.println("enter the name");
			String name = sc.next();
			System.out.println("enter the cgpa");
			double cgpa = sc.nextDouble();
			StudentDetails sd1 = new StudentDetails(id,name,cgpa);
			sd.add(sd1);
			records--; 
		}
		CgpaComparator cg = new CgpaComparator();
		Collections.sort(sd,new CgpaComparator());
		
		
		
	}

	

}
