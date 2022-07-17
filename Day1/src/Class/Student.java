package Class;   //create class Student and create 2 objects of Student using new keyword

public class Student {
	int id;
	String name;
	
	void StudentDetails(int i,String n) {
		id=i;
		name=n;
	}
	void StudentShowDetails() {
		System.out.println("enter student id:"+id);
		System.out.println("enter student name:"+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.StudentDetails(1,"swapnil");
		s1.StudentShowDetails();
		//System.out.println();
	}

}
