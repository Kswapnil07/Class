package comparator;

import java.util.Comparator;

import comparable.Student1;

public class StudentdeptComparator implements Comparator<Student> {
	
	public int compare(Student s1, Student s2)
	{
		return s1.name.compareTo(s2.dept);
	
}
}
