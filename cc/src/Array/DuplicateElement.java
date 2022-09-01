package Array;

import java.util.ArrayList;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(15);
		al.add(10);
		al.add(55);
		al.add(15);
		al.add(12);
		System.out.println(al);
		
		ArrayList<Integer> n=new ArrayList<>();

		for(Integer e:al)
		{
			if(!n.contains(e))
			//if(e%2!=0)
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


