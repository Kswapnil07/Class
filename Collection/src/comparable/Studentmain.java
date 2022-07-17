package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student (101,25,"vijay"));
		al.add(new Student (102,22,"raj"));
		al.add(new Student (103,23,"ram"));
		al.add(new Student (104,27,"ajay"));

		//System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}

}
