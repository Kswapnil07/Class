package Class;//Now id, name in student class. assign value to id, name there Itself and in main method print values then change value of instance variables and again print the values (Observe you cannot access id directly without creating object)

public class Student1 {
	
	int id;
	String name;
	void StudentData(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void display() {
	System.out.println(id+" "+name);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int id=101;
//		String name="krushna";
		Student1 s1=new Student1();
		s1.StudentData(101,"ram");
		s1.display();
	}

}
