package array;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> s=new LinkedList<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(70);
		s.add(50);
		s.add(80);
		s.add(10);
		s.add(90);
		
		Iterator<Integer> itr=s.descendingIterator();
		while(itr.hasNext())
		{
			
				System.out.println(itr.next());
		}
	}

}
