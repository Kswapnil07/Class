package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Student1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student1>al=new ArrayList<Student1>();
		al.add(new Student1 (101,75,"vijay","com"));
		al.add(new Student1 (102,72,"raj","mech"));
		al.add(new Student1 (103,65,"ram","civil"));
		al.add(new Student1 (104,75,"ajay","ele"));
		al.add(new Student1 (101,75,"vijay","com"));
		al.add(new Student1 (102,72,"raj","ele"));
		al.add(new Student1 (103,65,"ram","mech"));
		al.add(new Student1 (104,75,"ajay","entc"));
		al.add(new Student1 (107,85,"om","ele"));
		al.add(new Student1 (109,82,"ramesh","civil"));
		al.add(new Student1 (108,55,"rahul","com"));
		al.add(new Student1 (100,95,"ajay","entc"));

		//System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
