package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[]= {1,2,3,5,64,7,55,97,8,9,5,4,56,5};
		
			ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(al);
	}

}
