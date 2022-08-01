package aQ14Map;

import java.util.HashMap;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap m=new HashMap();
		m.put(101, "raj");
		m.put(102, "rakesh");
		m.put(107, "ramesh");
		m.put(104, "ajay");
		
		System.out.println(m);
		
		HashMap<String,Integer> map=new HashMap<>();
		map.put("vishal", 7);
		map.put("vijay", 5);
		map.put("ram", 7);
		map.put("ajay", 5);
		
		System.out.println(map.size());
		System.out.println(map);
		
		
		
		
	}

}
