package containment;

public class Employee {

	int id,salary;
	String name;
	Employee(int id,int salary,String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		
	}
	public String toString() {
		return id+" "+salary+" "+name;
	}
}
