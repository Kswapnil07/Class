package containment;

import java.util.ArrayList;

public class Department {

	int eid;
	String ename;
	ArrayList<Employee>emp;
	
	Department(int eid,String ename,ArrayList<Employee>emp)
	{
		this.eid=eid;
		this.ename=ename;
		this.emp=emp;
	}
	public String toString() {
		return eid+" " + ename+" "+emp;
	}
}
