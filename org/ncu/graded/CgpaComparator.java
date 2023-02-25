package org.ncu.graded;
import java.util.*;
public class CgpaComparator implements Comparator<StudentDetails> {
	public int compare(StudentDetails s1 , StudentDetails s2) {
		if(s1.setcgpa()== s2.setcgpa()) {
			if(s1.getname()==s2.getname()) {
				if(s1.getid()>s2.getid()) {
					return -1;
					
				}
				if(s1.getid()<s2.getid()) {
					return +1;
				}
				else {
					return 0;
				}
				
			}
			if(s1.setcgpa()>s2.setcgpa()) {
				return -1;
			}
			if(s1.setcgpa()<s2.setcgpa()) {
				return +1;
			}
			else {
				return 0;
			}
			
			
		}
		return 0;
	}
}
