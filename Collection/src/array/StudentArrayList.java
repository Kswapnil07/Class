package array;

import java.util.ArrayList;


public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al=new ArrayList<>();
			
		al.add(new Student(101,75,"raj","ele"));
		al.add(new Student(102,70,"raj","com"));
		al.add(new Student(103,65,"raj","civil"));
		al.add(new Student(104,75,"raj","ele"));
		al.add(new Student(105,70,"raj","entc"));
		al.add(new Student(106,55,"raj","ele"));
		al.add(new Student(107,75,"raj","mec"));
		
		for(Student s:al)
		{
			if(s.dept.equalsIgnoreCase("ele")&&s.marks>65)
			{
				System.out.println(s);
			}
		}
	}

}
