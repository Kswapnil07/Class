package arrayOfObject;

import java.util.Scanner;

public class EmployeeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("enter the id: ");
			int id=sc.nextInt();
			System.out.println("enter the salary");
			int salary=sc.nextInt();
			System.out.println("enter the name: ");
			String name=sc.next();
			System.out.println("enter the dept");
			String dept=sc.next();
			
			Employee e=new Employee();
			e.setId(id);
			e.setSalary(salary);
			e.setName(name);
			e.setDept(dept);
			
			emp[i]=e;
			
			
		}
		for(Employee e:emp) {
			System.out.println(e);
		}
		
	}

}
