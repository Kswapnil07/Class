package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=0;
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> list= new ArrayList<>();

		
		System.out.println("enter the number");
		
		for(int i=0;i<4;i++)
		{
			list.add(sc.nextInt());
		}
			for(Integer i:list)
			{
				if(i%2==0)
				{
					++c;
				}
			}
			
			System.out.println(c);
		
		
		
		
		
		
		
//		while(sc.hasNextInt())
//		{
//			int i=(sc.nextInt());
//			list.add(i);
//		}
//		System.out.println(list);
//		
//		ArrayList<Integer> n=new ArrayList<>();
//		
//		for(Integer e:list)
//		{
//			if(!n.contains(e))
//			if(e%2==0)
//			{
//				n.add(e);
//				++c;
//			}
//		}
//		System.out.println(c);
//		for(Integer en:n)
//		{
//			System.out.println(en);
//		}
	}}
