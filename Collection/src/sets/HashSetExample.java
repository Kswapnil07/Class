package sets;

import java.util.HashSet;

public class HashSetExample {

	static void traversSet(HashSet<Integer>hs)
	{
		for(Integer i:hs)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(70);
		hs.add(40);
		hs.add(60);
		hs.add(70);
		hs.add(80);
		hs.add(50);
		
		//System.out.println(hs);
	
		HashSetExample.traversSet(hs);
		
		
		
	}

}
