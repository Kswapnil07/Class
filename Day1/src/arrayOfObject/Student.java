package arrayOfObject;

public class Student {

	int id,marks;
	String name,dept;
	Student(int id,int marks,String name,String dept){
		this.id=id;
		this.marks=marks;
		this.name=name;
		this.dept=dept;
	}
	public String toString() {
		return id+" "+marks+" "+name+" "+dept;
	}
}
