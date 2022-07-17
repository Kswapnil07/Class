package comparable;

public class Employee implements Comparable <Employee> {
	
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
		return id+" "+salary+" "+name+" "+dept;
	}
	
	public int compareTo(Employee e)
	{
//		if(this.id>e.id)
//			return -1;
//		else if(this.id<e.id)
//		return 1;
//		else
//			return 0;
		
		//return this.name.compareTo(e.name);
		
		if(this.salary>e.salary) 
			return 1;
		else if(this.salary<e.salary)
			return -1;
		
		else
			if(this.id>e.id)
				return 1;
			else if(this.id<e.id)
				return -1;
			else
				return 0;
	}
	
}
