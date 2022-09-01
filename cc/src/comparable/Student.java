package comparable;

public class Student implements Comparable<Student> {

	int id,age;
	String name;
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	public String toString() {
		return id+" "+name+ " "+age;
	}
	public int compareTo(Student st)
	{
//		if(age==st.age)
//			return 0;
//			else if(age>st.age)
//				return 1;
//			else
//				return -1;
		
//		if(this.age>st.age)
//			return 1;
//		else if(this.age<st.age)
//			return -1;
//		else 
//			return
//				0;
		
		return this.name.compareTo(st.name);
		
			
		
	}
}
