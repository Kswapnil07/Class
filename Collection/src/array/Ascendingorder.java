package array;

import java.util.ArrayList;
import java.util.Collections;

public class Ascendingorder {

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
		al.add(10);
		al.add(20);
		al.add(300);
		al.add(400);
		
		System.out.println(al);
		
		Collections.sort(al);//ascending order
		System.out.println("ascending order:"+al);
		
		Collections.reverse(al);
		System.out.println(al);
	}

}
