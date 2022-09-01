package map;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"tfn","ele",75));
		al.add(new Student(2,"evve","com",85));
		al.add(new Student(3,"ram","ele",75));
		al.add(new Student(24,"steeve","com",85));
		al.add(new Student(9,"raj","civil",85));
		al.add(new Student(5,"ajay","entc",75));
		
		HashMap<String,Integer> hm=new HashMap<>();
		
		
		for(Student s:al)
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
