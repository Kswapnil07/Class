package generic;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> list=new ArrayList<>();
		
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()+" ");
		}
		//while()
		
//		al.add(3, 100);
//		System.out.println(al);
		
//		al.remove(3);
//		System.out.println(al);
//		al.clear();
//		System.out.println(al);
		
		
//		System.out.println(al.get(4));
//		System.out.println(al.isEmpty());
//		
//		
//		System.out.println(al.get(4));
//		System.out.println(al.indexOf(10)+" "+al.lastIndexOf(50));
//		
//		System.out.println(al.contains(500));
//		
//		System.out.println(al.set(2, 200));
//		System.out.println(al);
//		
//		list.add(100);
//		list.add(200);
//		list.add(3000);
//		
//		al.addAll(list);//index collection
//		System.out.println(al);
//		
////		al.removeAll(list);//remove common element also
////		System.out.println(al);
//		
//		al.retainAll(list);
//		System.out.println(al);
//		
//		System.out.println(al.contains(list));
//		
//		ArrayList<Integer> list1=new ArrayList<>();
//		
//		list1.add(100);
//		list1.add(2000);
//		list1.add(3000);
//		
//		System.out.println(list.equals(list1));
		
		
	
	}

}
