package containmentArray;

import java.util.ArrayList;

public class Student {

	int id;
	String name,dept;
	ArrayList<Integer>marks;
	
	Student(int id,String name,String dept,ArrayList<Integer>marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
