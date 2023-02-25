package org.ncu.hashdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


class Book{
	int bookno;
	String bookname;
	int qty;
	public Book(int bookno, String bookname , int qty ) {
		this.bookno = bookno;
		this.bookname = bookname;
		this.qty = qty;
		
	}
}

public class BookPractHash {

	public static void main(String[] args) {
		Set<Book> set1 = new HashSet<Book>();// in insertion order
		//Set<Book> set1 = new HashSet<Book>(); --> in random order
		
		Book b1 = new Book(1,"slarora",22);
		Book b2 = new Book(2,"pradeep",45);
		Book b3 = new Book(3,"ml ",11);
		set1.add(b1);
		set1.add(b2);
		set1.add(b3);
		for(Book b:set1){  
		    System.out.println(b.bookno+" "+b.bookname+" "+b.qty);  
		    }  
		
		

	}

}
