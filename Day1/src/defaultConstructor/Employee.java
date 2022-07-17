package defaultConstructor;

public class Employee {
int id,salary;
String firstname,lastname,dept;
Employee(){}
	void setId(int id) {
	this.id=id;	
}
	int getid() {
		return id;
	}
	void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	
	
	String getfirstname() {
		return firstname;
	}
	
	void SetLastname(String lastname) {
		
		this.lastname=lastname;
	}
	
	String getlastname(){
		return lastname;
	}
	void SetDept(String dept) {
		this.dept=dept;
	}
	String getdept() {
		return dept;
	}
	void setSalary(int salary){
		this.salary=salary;
	}
	int getsalary() {
		return salary;
	}
	
	public String toString() {
		return id+" "+firstname+" "+lastname+" "+dept+" "+salary;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee(); 
			
			e1.setId(10);
			e1.setFirstname("ram");
			e1.SetLastname("fwef");
			e1.SetDept("elec");
			e1.setSalary(30000);
			System.out.println(e1);
		}
		
	}


