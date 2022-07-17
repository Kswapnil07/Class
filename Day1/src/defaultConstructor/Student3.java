package defaultConstructor;
import java.util.Scanner;
public class Student3 {

	int id,marks;
	String name,dept,contact ,city;
	
	Student3(int id,int marks,String name,String dept,String contact,String city){
		this.id=id;
		this.marks=marks;
		this.name=name;
		this.dept=dept;
		this.contact=contact;
		this.city=city;
	}
	void grade() {
		if(marks>=80) {
			System.out.println("first class");
		}
		else if(marks>=60) {
			System.out.println("second class");
		}
		else if(marks>=49) {
			System.out.println("third class");
		}
		else {
			System.out.println("fail");
		}
		
	}
	public String toString() {
		return id+" "+marks+" "+name+"" +dept+" "+contact+" "+city;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id,marks,name,dept,contact,city");
		int id=sc.nextInt();
		int marks=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		String contact=sc.next();
		String city=sc.next();
		
		Student3 s1=new Student3(id,marks,name,dept,contact,city) ;
			s1.grade();
			System.out.println(s1);
			
		
	}

}
