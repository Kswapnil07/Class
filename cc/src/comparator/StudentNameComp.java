package comparator;

import java.util.Comparator;

public class StudentNameComp implements Comparator<Student> {
	
	public int compare (Student s,Student s1) {
		
		return s.name.compareTo(s1.name);
	}

	
	
	}
	
