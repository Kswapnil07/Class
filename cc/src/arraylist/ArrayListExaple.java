package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("apple");
		al.add("mango");
		al.add("banana");
		al.add("grapes");
		
		//System.out.println(al);
		
		//Traversing list through Iterator  
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
		}
		
		////Traversing list through for-each loop
		
		for(String f:al)
		{
			System.out.println(f);
		}
	}

}
