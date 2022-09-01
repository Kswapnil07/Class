package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(100, "hgc");
		hm.put(101, "ABC");
		hm.put(102, "hgh");
		hm.put(108, "trt");
		hm.put(104, "Acv");
		hm.put(109, "hcm");
		hm.put(106, "kcv");
		hm.put(107, "bvb");
		hm.put(103, "xfg");
		
		System.out.println(hm);
		System.out.println("---key---");
		for(Integer i:hm.keySet())
		{
			System.out.println(i);
		}
		
		System.out.println("- - - -value----");
		for(String s:hm.values())
		{
			System.out.println(s);
		}
		
		System.out.println("-----map entry------");
		for(Map.Entry<Integer,String> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("---Iterator---");
		Iterator itr=hm.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Iterator using map-----");
		
		Iterator<Map.Entry<Integer, String>>lmitr=hm.entrySet().iterator();
		while(lmitr.hasNext())
		{
			Map.Entry<Integer, String > ent=lmitr.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
	
	
	}
	
	

}
