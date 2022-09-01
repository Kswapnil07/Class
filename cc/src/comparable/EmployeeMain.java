package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee(101,4500,"Ram","Hr"));
		al.add(new Employee(102,3500,"Raj","sale"));
		al.add(new Employee(103,4000,"Ramesh","Hr"));
		
		
		Collections.sort(al);
		System.out.println(al);
		
		
	}

}
