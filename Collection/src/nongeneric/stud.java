package nongeneric;

public class stud {

	int id,marks;
	String name;
	
	stud(int id,int marks,String name)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	@Override
	public String toString() {
		return   id + " " + marks + " " + name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
