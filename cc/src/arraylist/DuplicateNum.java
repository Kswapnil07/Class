package arraylist;

import java.util.ArrayList;

public class DuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(5);
		al.add(2);
		al.add(5);
		al.add(3);
		System.out.println(al);
		
		ArrayList<Integer> n=new ArrayList<>();
		
		for(Integer e:al)
		{
			if(!n.contains(e))
			if(e%2==0)
			{
				n.add(e);
			}
		}
		for(Integer en:n)
		{
			System.out.println(en);
		}
		
		
	}

}
