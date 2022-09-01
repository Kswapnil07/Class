package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"Raj","ele",85));
		al.add(new Student(5,"Ram","com",75));
		al.add(new Student(2,"Ramesh","entc",45));
		al.add(new Student(4,"Ajay","civil",95));
		al.add(new Student(3,"Vijay","com",70));
		al.add(new Student(2,"Swapnil","ele",77));
		
		//System.out.println(al);
	//Collections.sort(al,new StudentNameComp());
	Collections.sort(al,new Studentdept());
		System.out.println(al);
		
	}

}
