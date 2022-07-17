package array;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

          ArrayList<Student> al=new ArrayList<>();
		
		
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<3;i++) {
			System.out.println("enter the id: ");
			int id=sc.nextInt();
			System.out.println("enter the marks");
			int marks=sc.nextInt();	
			System.out.println("enter the name: ");
			String name=sc.next();
			System.out.println("enter the dept");
			String dept=sc.next();
			
			al.add(new Student(id,marks,name,dept));
			
		}
		for(Student a:al)
		{
			if(a.dept.equalsIgnoreCase("ele")&& a.marks>65)
			System.out.println(a);
		}
	
	}

}
