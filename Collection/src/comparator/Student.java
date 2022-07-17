package comparator;


public class Student implements Comparable<Student>{

	int id,marks;
	String name,dept;
	
	Student(int id,int marks,String name,String dept)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
		this.dept=dept;
		
	}
	public String toString() {
		return id+" "+marks+" "+name+" "+dept;
	}
	
	public int compareTo(Student s)
	{
		
			return this.id-s.id;
			
		}
			
	}

