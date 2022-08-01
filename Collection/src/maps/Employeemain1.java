package maps;

import java.util.HashMap;

public class Employeemain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Employee1 ,Integer > m=new HashMap<>();
		m.put(new Employee1(101,"riya","hr"), 60000);
		m.put(new Employee1(102,"ram","sales"), 5000);
		m.put(new Employee1(103,"raj","development"), 70000);
		m.put(new Employee1(104,"ramesh","hr"), 55000);
		m.put(new Employee1(102,"riya","hr"), 60000);
		m.put(new Employee1(105,"ram","sales"), 5000);
		
		System.out.println(m);
		
	}

}
