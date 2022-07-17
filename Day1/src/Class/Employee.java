package Class;

public class Employee {
	
	int id,Salary;
	String name,dept;
	
	void acceptdetails(int i,int s,String n,String d) {
		 id=i;
		Salary=s;
		name=n;
		 dept=d;
	}
	void showdetails() {
		System.out.println("enter the id:"+id);
		System.out.println("enter the Salary:"+Salary);
		System.out.println("enter the name:"+name);
		System.out.println("enter the dept:"+dept);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		e1.acceptdetails(10,10000,"sw","ele");
	
		e1.showdetails();
	}

}
