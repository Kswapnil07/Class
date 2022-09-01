package linked;

import java.util.Iterator;
import java.util.LinkedList;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll=new LinkedList<>();
		ll.add("ajay");
		ll.add("vijay");
		ll.add("Ramesh");
		ll.add("ram");
		
//		Iterator<String> itr=ll.iterator();
//		while(itr.hasNext())
//				{
//			System.out.println(itr.next());
//				}
		 Iterator i=ll.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
			
		
		
	}

}
