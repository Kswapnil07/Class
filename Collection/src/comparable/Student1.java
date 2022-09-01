package comparable;

public class Student1 implements Comparable<Student1> {

	int id,marks;
	String name,dept;
	
	Student1(int id,int marks,String name,String dept)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
		this.dept=dept;
		
	}
	public String toString() {
		return id+" "+marks+" "+name+" "+dept;
	}
	
	public int compareTo(Student1 st)
	{
		
//		if( this.dept.equals(st.dept))
//		{
//	
//		
//			if(this.marks>st.marks)
//				return 1;
//			else if(this.marks<st.marks)
//				return -1;
//			
//			else
				return this.id-st.id;
			//return this.name.compareTo((st.name));
		}
//		else
//			return this.dept.compareTo(st.dept);
				
		
	
	
	
}
