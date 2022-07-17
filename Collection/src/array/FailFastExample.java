package array;

import java.util.ArrayList;
import java.util.ListIterator;

public class FailFastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(50);
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(70);
		
		//System.out.println(al);
		
//		for(int i=0;i<al.size();i++) {
//			if(al.get(i)==20)
//			{
//				al.add(200);
//			}
//			
//		}
//		System.out.println(al);
		
		
		
		//ok
		
//		for(Integer i:al)  //fail fast iterator
//		{
//			if(i==20)
//				al.remove(1);
//		}
		ListIterator<Integer> litr=al.listIterator(); //fail safe iterator
		while(litr.hasNext())
		{
			if(litr.next()==20)
				litr.remove();    //listIterator
			
		}
			
		System.out.println(al);
	}

}
