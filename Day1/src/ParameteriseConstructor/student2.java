package ParameteriseConstructor;

public class student2 {

	int id,marks;
	String name,dept,city,contact;
	
	student2(int id,int marks,String name,String dept,String city,String contact){
		this.id=id;
		this.marks=marks;
		this.name=name;
		this.dept=dept;
		this.city=city;
		this.contact=contact;
		
	}
	public String toString() {
		return id+" "+marks+" "+name+" "+dept+ " "+city+ " "+contact;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student2 s=new student2(101,65, "ele", "djhgcm" , "pune","548654694");
		System.out.println(s);
		
	}

}
