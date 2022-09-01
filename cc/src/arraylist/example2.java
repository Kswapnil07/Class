package arraylist;

import java.util.ArrayList;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//get and set array list
		ArrayList<String> al=new ArrayList<>();
	
		al.add("mango");
		al.add("banana");
		al.add("apple");
		al.add("grapes");
		
		System.out.println(al.get(1));
		
		al.set(1, "vjykbj");
		System.out.println(al);
		
		for(String ll:al)
		{
			System.out.println(ll);
		}
	}

}
