package Class;

import java.util.Scanner;



public class Employee1 {

	int id ,salary;
	String name,dept,designation,rating;
	
	void employeeData(int i,int s,String n,String de,String des,String r){
		id=i;
		salary=s;
		name=n;
		dept=de;
		designation=des;
		rating =r;
	}
	void bonous() {
		if(rating.equals("A")) {
			salary=salary*15/100+salary;
			System.out.println(salary);
		}
		else if(rating.equals("b")){
			salary=salary*10/100+salary;
			System.out.println(salary);
			
			
		}
		else if(rating.equals("no bonous")) {
			
			System.out.println(salary);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id,salary;
		String name,dept,designation,rating;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the employee id,name,dept,designation,rating,salary: ");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		designation=sc.next();
		rating=sc.next();
        salary=sc.nextInt();
        
        Employee s1=new Employee();
       // s1.employeeData(id,name,dept,designation,rating,salary);
        
	}

}
