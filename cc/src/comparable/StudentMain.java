package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"Ram",21));
		al.add(new Student(2,"Raj",23));
		al.add(new Student(3,"Rahul",24));
		al.add(new Student(15,"Ajay",11));
		al.add(new Student(4,"Ramesh",53));
		al.add(new Student(5,"Vijay",12));
		
		//System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
//		Iterator<Student> itr=al.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
	}

}
