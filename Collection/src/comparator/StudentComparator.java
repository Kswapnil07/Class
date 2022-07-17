package comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	
public int compare(Student s1,Student s2)
{
	if(s1.dept.equals(s2.dept))
	
		return s1.id-s2.id;
		else
			return s1.dept.compareTo(s2.dept);
	
}
	
}
