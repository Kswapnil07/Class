package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee (55,50000,"araj","hr"));
		al.add(new Employee (12,60000,"bram","sale"));
		al.add(new Employee (10,55000,"comkar","marketing"));
		al.add(new Employee (2,59000,"dkrisha","hr"));
		al.add(new Employee (3,60000,"erahul","hr"));
		al.add(new Employee (15,50000,"fswapnil","sale"));
		al.add(new Employee (8,70000,"gshri","service"));
		
		Collections.sort(al);
		//Collections.reverse(al);
		System.out.println(al);

		
		
	}

}
