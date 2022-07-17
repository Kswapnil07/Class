package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer ,String > hm=new HashMap<>(); //random
		LinkedHashMap<Integer,String> hm1=new LinkedHashMap<>();//retain the order of isertion
		TreeMap<Integer ,String> hm2=new TreeMap<>();//Ascending
		
		hm.put(101, "ABC");
		hm.put(102, "hfj");
		hm.put(103, "fwf");
		hm.put(10, "ABC");
		hm.put(12, "hfj");
		hm.put(133, "fw");
		hm.put(141, "AB");
		hm.put(152, "hfj");
		hm.put(143, "nbsr");
		
		System.out.println(hm);
		//System.out.println(hm1);
		//System.out.println(hm2);
		System.out.println(hm.isEmpty());
		System.out.println(hm.get(101)); //value of key
		System.out.println(hm.containsKey(175));//whether is present
		System.out.println(hm.containsValue("hfj"));
		
		
		System.out.println(hm.hashCode());
		hm.remove(101);
		System.out.println(hm);
		
//		hm.clear();
//		System.out.println(hm);
		
		System.out.println(hm.size());
		
		hm.replace(101, "yjc");
		System.out.println(hm);
		
		hm.put(143, "UVW");
		System.out.println(hm);
		
		hm.put(143, "GhI");
		System.out.println(hm);
		
		HashMap<Integer ,String > hm4 =new HashMap<>(); //random
		
		hm4.put(1000, "ABCD");
		hm4.put(2000, "ASDF");
		hm4.put(3000, "ZXCV");
		hm4.put(4000, "VUES");
		
		hm4.putAll(hm4);
		System.out.println(hm4);
		
		
		//Traversing map
		
		
		for(Integer i:hm.keySet()) //gives only key
		{
			System.out.println(i);
		}
		for(String s:hm.values()) //only values of the map
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("------Entry map----");
		
		for(Map.Entry<Integer, String> entry: hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println();
		System.out.println("------Iterator-------");
//		Set<E> s=hm.entrySet();
//		Iterator itr=s.iterator();
		
		Iterator itr=hm.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		System.out.println("---Iterator using map-----");
		
		Iterator<Map.Entry<Integer , String>> lmitr=hm.entrySet().iterator();
		while(lmitr.hasNext())
		{
			Map.Entry<Integer, String > ent=lmitr.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		
		
	}

}
