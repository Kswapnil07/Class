package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListToHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(100);
		al.add(20);
		al.add(50);
		al.add(100);
		al.add(200);
		al.add(20);
		al.add(100);
		al.add(20);
		al.add(50);
		al.add(100);
		al.add(300);
		al.add(20);
		
		//System.out.println(al);
		
	HashMap<Integer ,Integer> hm=new HashMap<>();
	for(Integer i:al)
	{
		if(hm.containsKey(i))
		{
			int v=hm.get(i)+1;
			hm.put(i, v);
		}
		
	
	else
		hm.put(i, 1);
		
	}
	System.out.println(hm);
	}

}
