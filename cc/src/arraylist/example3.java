package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(20);
		al.add(25);
		al.add(21);
		al.add(24);
		al.add(2);
		al.add(5);
		al.add(1);
		al.add(4);
		al.add(8);
		al.add(7);
		al.add(6);
		al.add(27);
		//System.out.println(al);
		
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		for(Integer num:al)
		{
			System.out.println(num);
		}
		
	}

}
