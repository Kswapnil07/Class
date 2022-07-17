package generic;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(50);
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(70);
		System.out.println(al);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int cnt=0;
		for(Integer s:al)
		{
				if(num==s)
				{
					cnt++;
				}
			
		}
			System.out.println(num+" "+cnt);
			//System.out.println(al.get(i));
		
		
		
		
		
		}
}


