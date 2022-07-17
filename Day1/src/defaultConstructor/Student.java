package defaultConstructor;

public class Student {

	int id,marks;
	String name;
	Student(){}	
	
	void SetId(int id) {
		this.id=id;
	}
	 int getid(){
		return id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getname() {
		return name;
	}
	void SetMarks(int marks) {
		this.marks=marks;
		
	}
	int getmarks() {
		return marks;
	}
	
	public String toString() {
		return id+" "+name+" "+marks;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
	s1.SetId(101);
	s1.setName("ajay");
	s1.SetMarks(85);
System.out.println(s1);
	}

}
