package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(45);
		al.add(55);
		System.out.println(al);
		
		int a[]= new int [al.size()];
		for(int i=0;i<al.size();i++)
		{
			a[i]=al.get(i);
			
		}
		//System.out.println(Arrays.toString(a));
		
	}

}
