package arraylist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> lm =new LinkedList<>();
		lm.add(100);
		lm.add(200);
		lm.add(600);
		lm.add(200);
		lm.add(500);
		lm.add(200);
		
		Iterator<Integer> itr=lm.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
