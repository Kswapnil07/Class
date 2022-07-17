package maps;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,String> hm1=new LinkedHashMap<>();
		
		hm1.put(101, "ABC");
		hm1.put(102, "hfj");
		hm1.put(103, "fwf");
		hm1.put(10, "ABC");
		hm1.put(12, "hfj");
		hm1.put(133, "fw");
		hm1.put(141, "AB");
		hm1.put(152, "hfj");
		hm1.put(143, "nbsr");
		
	
		System.out.println(hm1);
	}

}
