package containmentArray;

import java.util.ArrayList;

public class StudentArrayC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> s1=new ArrayList<>();
		
		s1.add(75);
		s1.add(85);
		s1.add(65);
		s1.add(70);
		
		
		ArrayList<Integer> s2=new ArrayList<>();
		
		s2.add(70);
		s2.add(65);
		s2.add(55);
		s2.add(70);
		
		
		ArrayList<Integer> s3=new ArrayList<>();
		
		s3.add(55);
		s3.add(85);
		s3.add(95);
		s3.add(80);
		
		ArrayList<Student> al=new ArrayList<>();
		
		al.add(new Student(101,"raj","ele",s1));
		al.add(new Student(102,"om","com",s2));
		al.add(new Student(103,"ram","civil",s3));
		
		for(Student s:al)
		{
			int sum=0;
			for(Integer i:s.marks)
			{
				sum+=i;
			}
			double percent=sum/s.marks.size();
			if(percent>65)
			System.out.println(s.name+" "+percent);
		}
	}

}
