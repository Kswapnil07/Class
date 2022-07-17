package containment;

import java.util.ArrayList;
import java.util.Scanner;

public class DeptEmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Department> dept=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dept size");
		int s=sc.nextInt();
		
		for(int i=0;i<s;i++)
		{
			
			System.out.println("enter  dept eid,ename ");
			
			int eid=sc.nextInt();
			String ename=sc.next();
			
			ArrayList<Employee> emp=new ArrayList<>();
			
			for(int j=0;j<2;j++)
			{
				System.out.println("enter employee id name salary");
				
				int id=sc.nextInt();
				int salary=sc.nextInt();
				String name=sc.next();
				
				emp.add(new Employee(id,salary,name));
			}
			
		//	dept.add(new Department(eid,ename));
		}
		
		for(Department d:dept)
		{
			for(Employee e:d.emp)
			{
				if(e.salary==60000)
					System.out.println(e.name+" "+e.salary);
			}
		}

	}

}
