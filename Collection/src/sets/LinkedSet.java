package sets;

import java.util.LinkedHashSet;
	
public class LinkedSet {

	static void traversSet(LinkedHashSet<Integer>lm)
	{
		for(Integer i:lm)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Integer> lm=new LinkedHashSet<>();
		
		lm.add(10);
		lm.add(20);
		lm.add(50);
		lm.add(40);
		lm.add(50);
		lm.add(60);
		lm.add(70);
		lm.add(80);
		
		//System.out.println(lm);
		LinkedSet.traversSet(lm);
	}

}
