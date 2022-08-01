package sets;

import java.util.Comparator;

public class EmployeeDept implements Comparator<Employee>{

	public int compare (Employee e1,Employee e2)
	{
		return e1.dept.compareTo(e2.dept);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
