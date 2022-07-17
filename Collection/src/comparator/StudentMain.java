package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student (101,75,"vijay","com"));
		al.add(new Student (102,72,"raj","mech"));
		al.add(new Student (103,65,"ram","civil"));
		al.add(new Student (104,75,"ajay","ele"));
		al.add(new Student (101,75,"vijay","com"));
		al.add(new Student (102,72,"raj","ele"));
		al.add(new Student (103,65,"ram","mech"));
		al.add(new Student (104,75,"ajay","entc"));
		al.add(new Student (107,85,"om","ele"));
		al.add(new Student (109,82,"ramesh","civil"));
		al.add(new Student (108,55,"rahul","com"));
		al.add(new Student (100,95,"ajay","entc"));

		//System.out.println(al);
		//Collections.sort(al);
		//Collections.sort(al,new StudentdeptComparator());
		//Collections.sort(al,new StudentComparator ());
		Collections.sort(al,new StudentName());
		System.out.println(al);
	}

}
