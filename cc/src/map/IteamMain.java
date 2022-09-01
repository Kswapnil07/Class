package map;

import java.util.ArrayList;
import java.util.HashMap;



public class IteamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Iteam> al=new ArrayList<>();
		al.add(new Iteam (1,"Parleg","Britinya",10));
		al.add(new Iteam(101,"rusk","Britannia",40));
		al.add(new Iteam(105,"coffee","Nestle",100));
		al.add(new Iteam(104,"IceCream","Amul",80));
		al.add(new Iteam(103,"Ponds","Unilever",150));
		al.add(new Iteam(100,"goodday","Britannia",10));
		al.add(new Iteam(107," panner","Amul",70));
		
		HashMap<String ,Integer> hm=new HashMap<>();
		
		for(Iteam s:al)
		{
			if(hm.containsKey(s.company))
			{
				int v=hm.get(s.company)+1;
				hm.put(s.company, v);
			}
			else
				hm.put(s.company, 1);
			
		}
		System.out.println(hm);
	}

}
