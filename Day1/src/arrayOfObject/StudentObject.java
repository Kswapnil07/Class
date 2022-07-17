package arrayOfObject;

import java.util.Scanner;

public class StudentObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stud[]=new Student[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("enter the id");
			int id=sc.nextInt();
			System.out.println("enter marks");
			int marks=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter dept");
			String dept=sc.next();
			
			stud[i]=new Student(id,marks,name,dept);
			
		}
		
		for(Student a:stud) {
			System.out.println(a);
		}
	}

}
