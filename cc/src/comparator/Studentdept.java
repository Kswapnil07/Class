package comparator;

import java.util.Comparator;

public class Studentdept implements Comparator<Student> {

	

		public int compare(Student s,Student s1)
		{
			return s.name.compareTo(s.dept);
		}
	}


