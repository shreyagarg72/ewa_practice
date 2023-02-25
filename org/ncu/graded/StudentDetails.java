package org.ncu.graded;

public class StudentDetails implements Comparable<StudentDetails> {
	private Integer id;
	private String name;
	private double cgpa;
	public StudentDetails(Integer id,String name,double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		
		
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public double setcgpa() {
		return cgpa;
	}
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", cgpa=" + cgpa +" ]";
	}
	@Override
	public int compareTo(StudentDetails o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
