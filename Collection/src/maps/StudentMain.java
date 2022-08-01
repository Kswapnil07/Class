package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student>a=new ArrayList<>();
		
		a.add(new Student(101,65,"raj","ele"));
		a.add(new Student(102,75,"ajay","entc"));
		a.add(new Student(103,65,"ram","com"));
		a.add(new Student(104,75,"ramesh","civil"));
		a.add(new Student(105,65,"raj","ele"));
		a.add(new Student(106,75,"ajay","entc"));
		a.add(new Student(105,65,"riya","com"));
		a.add(new Student(106,75,"pooja","entc"));
		

		HashMap<String ,Integer> hm=new HashMap<>();
		
		for(Student s:a)
		{
			if(hm.containsKey(s.dept))
			{
				int v=hm.get(s.dept)+1;
				hm.put(s.dept, v);
			}
			
		
		else
			hm.put(s.dept, 1);
			
		}
		System.out.println(hm);
		}
		
		
	}


