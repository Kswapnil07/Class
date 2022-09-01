package arraylist;

import java.util.ArrayList;



public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student>al=new ArrayList<>();
		
		al.add(new Student(101,"ram",55));
		al.add(new Student (102,"Raj",65));
		al.add(new Student(103,"ajay",85));
		al.add(new Student (105,"vijay",75));
		al.add(new Student(106,"rahul",65));
		al.add(new Student (102,"Ramesh",995));
		
		System.out.println(al);
		
		for(Student s:al)
		{
			System.out.println(s);
		}
	}

}
