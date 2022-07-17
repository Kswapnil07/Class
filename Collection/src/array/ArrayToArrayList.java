package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[]= {10,20,30,40,50,60,70,80,1,2,3,5,6,8};
		
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
		System.out.println(al);
	}

}
