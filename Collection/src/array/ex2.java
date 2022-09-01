package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=0;
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> al=new ArrayList<>();
	
	System.out.println("enter number");
	while(sc.hasNextInt())
	{
		al.add(sc.nextInt());
	}
		System.out.println(al);
//		al.add(1);
//		al.add(2);
//		al.add(3);
//		al.add(5);
//		al.add(2);
//		al.add(5);
//		al.add(3);
//		System.out.println(al);
		
		ArrayList<Integer> n=new ArrayList<>();
	
		for(Integer e:al)
		{
			//if(!n.contains(e))
			if(e%2==0)
			{
				n.add(e);
				++c;
			}
		}
		System.out.println(c);
//		for(Integer en:n)
//		{
//			System.out.println(en+" "+c);
//		}
	}

}
