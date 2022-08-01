package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListToHashMapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<>();
		
		al.add("Sun");
		al.add("Mon");
		al.add("Tus");
		al.add("Wen");
		al.add("Thu");
		al.add("Fri");
		al.add("Sat");
		al.add("Mon");
		al.add("Tus");
		al.add("Sun");
		al.add("Mon");
		al.add("Tus");
		
		HashMap<String ,Integer> hm=new HashMap<>();
		for(String s:al)
		{
			if(hm.containsKey(s))
			{
				int v=hm.get(s)+1;
				hm.put(s, v);
			}
			
		
		else
			hm.put(s, 1);
			
		}
		System.out.println(hm);
		}
		
	}


