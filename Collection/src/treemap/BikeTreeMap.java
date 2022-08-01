package treemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class BikeTreeMap {
	public static void main(String[] args) {

	HashMap<Integer,String> hm=new HashMap<>();
	hm.put(86, "Anjali");
	hm.put(55, "Rohan");
	hm.put(60, "Raj");
	
	HashMap<Integer,String> hm1=new HashMap<>();
	hm1.put(71, "Sachin");
	hm1.put(51, "Ajay");
	hm1.put(44, "Ram");
	
	TreeMap<Integer,HashMap<Integer ,String>> tm=new TreeMap<>();
	tm.put(1, hm);
	tm.put(2, hm1);
	System.out.println(tm);
	
	for(Map.Entry<Integer, HashMap<Integer,String>> ent:tm.entrySet())
	{
		System.out.println(ent.getKey());
		for(Map.Entry<Integer, String>hent:ent.getValue().entrySet())
		{
			System.out.println(hent.getKey()+" "+hent.getValue());
		}
	}
//	Iterator itr=hm.entrySet().iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
	
	
}
}