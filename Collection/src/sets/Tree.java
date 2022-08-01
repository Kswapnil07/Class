package sets;

import java.util.TreeSet;

public class Tree {

	static void traversSet(TreeSet<Integer>tm)
	{
		for(Integer i:tm)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> tm=new TreeSet<>();
		tm.add(20);
		tm.add(50);
		tm.add(20);
		tm.add(5);
		tm.add(10);
		tm.add(30);
		tm.add(40);
		tm.add(70);
		//System.out.println(tm);
		
		Tree.traversSet(tm);
	}

}
