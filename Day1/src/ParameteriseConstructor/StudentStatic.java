package ParameteriseConstructor;

public class StudentStatic {

	int id,marks;
	String name;
	static String colgname="ABC";
	StudentStatic(int id,int marks,String name){
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	static void colgname1() {
		System.out.println("colgname name is: "+colgname);
	}
	void display() {
		System.out.println(id+" "+name+" "+marks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentStatic s1=new StudentStatic(101,55,"ram");
		s1.display();
		StudentStatic.colgname1();
			
		}
		
	}


