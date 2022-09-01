package map;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(1, "Ajay");
		hm.put(5, "Vijay");
		hm.put(3, "Rahul");
		hm.put(7, "Raj");
		hm.put(4, "Ram");
		hm.put(2, "ajay");
		hm.put(null, null);
		hm.put(6, null);
	
		
		//System.out.println(hm);
		//iterating hashmap
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(9,"Anil");
		hm1.putAll(hm);
		for(Map.Entry m:hm1.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
