package ParameteriseConstructor;

public class Student {

	int id,marks;
	String name;
	
	Student(int id,int marks,String name){
		this.id=id;
		this.marks=marks;
		this.name=name;
		
	}
	
	public String toString() {
		return id+" "+marks+" "+name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(101,65,"raju");
		System.out.println(s1);
	}

}
