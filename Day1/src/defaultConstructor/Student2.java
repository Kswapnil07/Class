package defaultConstructor;

public class Student2 {

	int id,marks;
	String name,dept,city,contact;
	Student2(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String toString() {
		return id+" "+marks+" "+name+" "+dept+" "+city+" "+contact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 s2=new Student2();
		s2.setId(101);
		s2.setMarks(85);
		s2.setName("fwer");
		s2.setCity("sgbth");
		s2.setContact("8784545212");
		s2.setDept("frgre");
		System.out.println(s2);
	}

}
