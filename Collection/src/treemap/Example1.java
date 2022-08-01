package treemap;

import java.util.TreeMap;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer ,String> tm=new TreeMap<>();
		
		tm.put(101, "Raj");
		tm.put(102, "Ramesh");
		tm.put(103, "Ganesh");
		tm.put(10, "Ram");
		tm.put(12, "Riya");
		tm.put(133, "Rohan");
		tm.put(141, "Anjali");
		tm.put(152, "omkar");
		tm.put(143, "pooja");
		tm.put(153, "Vijay");
		
		System.out.println(tm);
		System.out.println(tm.descendingMap());
		//System.out.println(tm.getOrDefault(255, "no available"));
		System.out.println(tm.ceilingKey(103)); //it will return key which is greater than 103
		System.out.println(tm.ceilingEntry(103));
		
		System.out.println(tm.floorKey(133));//return key less than 133
		System.out.println(tm.floorEntry(133));
		
		System.out.println(tm.firstKey());
		System.out.println(tm.firstEntry());
		
		System.out.println(tm);
		
		System.out.println(tm.tailMap(101,false));//start key
		System.out.println(tm.headMap(12,true));//end key
		
		System.out.println(tm.subMap(101,false,133,true));
		
		System.out.println(tm.higherKey(101)); //return key strictly greater than 101
		System.out.println(tm.higherEntry(101));
		
		System.out.println(tm.lowerKey(152));//strictly less than 152 
		
		
		
//		System.out.println("key set:"+tm.keySet());
//		System.out.println("first key:"+tm.firstKey());
//		System.out.println("Last key:"+tm.lastKey());
//		System.out.println("Lower key:"+tm.lowerKey(100));
//		System.out.println("Higher key:"+tm.higherKey(150));
	}

}
