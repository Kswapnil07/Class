package generic;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8); 
		al.add(9);
		
		System.out.println(al);
		
		for(int i=0;i<9;i++)
		{
			if(al.get(i)%3==0)
			{
		System.out.println(al.get(i)+" ");
			}
		}
	}

}
