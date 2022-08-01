package sets;

import java.util.TreeSet;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Employee> tm=new TreeSet<>();
		tm.add(new Employee(101,"Ram"," Hr",50000));
		tm.add(new Employee(102,"Vijay","Sales",55000));
		tm.add(new Employee(105,"Ajay","Development",65000));
		tm.add(new Employee(107,"Rahul"," Hr",40000));
		tm.add(new Employee(103,"Ramesh"," Service",50000));
		
System.out.println(tm);
		
		
	}

}
