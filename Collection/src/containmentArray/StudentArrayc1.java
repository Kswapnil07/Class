package containmentArray;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayc1 {

	public static void main(String[] args) {
		
		ArrayList<Student> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println("enter id, name,dept");
			int i1 = sc.nextInt();
			String n1 = sc.next();
			String d1 = sc.next();

			ArrayList<Integer> al = new ArrayList<>();
			
			for (int j = 0; j < 4; j++)
			{
				System.out.println("enter marks");
				int m1 = sc.nextInt();
				al.add(m1);
			}

			a.add(new Student(i1, n1, d1, al));

		}
		for (Student k : a)
		{
			int sum = 0;
			for (Integer i : k.marks)
			{
				sum += i;
			}
			double percent = sum / k.marks.size();
			if (percent > 65) {
				System.out.println(k.name + " " + percent);
			}

		}
	}
}
