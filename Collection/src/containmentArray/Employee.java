package containmentArray;

public class Employee {

	int id,salary;
	String name,dept;
	Employee(int id,int salary,String name,String dept)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.dept=dept;
		
	}
	public String toString() {
		return id+salary+name+dept;
	}
}
