package array;

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
		al.add(500);
		al.add(600);
		al.add(300);
		al.add(400);
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
		int arr[]=new int [al.size()];
		for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
		//	al.add(arr[i]);//converting array to arraylist
		}
		System.out.println(Arrays.toString(arr));
		
		Integer ai[]=new Integer[al.size()];
		al.toArray(ai);
		
		System.out.println("object array: "+Arrays.toString(ai));//Arrays utility class
		
	}

}
