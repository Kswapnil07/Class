package comparator;

import java.util.Comparator;

public class Student implements Comparable <Student>{

	int id,marks;
	String name,dept;
	Student(int id,String name,String dept,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+ " "+dept+" "+marks; 
	}
	public int compareTo(Student s)
	{
		return this.id-s.id;
	}
	
	
	
}
