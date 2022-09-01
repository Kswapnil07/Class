package map;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Order> al=new ArrayList<>();
		al.add(new Order(1,"Pending","Latur",20));
		al.add(new Order(2,"Delivered","Solapur",52));
		al.add(new Order(3,"Pending","pune",30));
		al.add(new Order(4,"Delivered","Mumbai",50));
		al.add(new Order(5,"Pending","Latur",20));
		al.add(new Order(6,"Delivered","Solapur",52));
		al.add(new Order(7,"Pending","Latur",20));
		al.add(new Order(8,"Delivered","Solapur",52));
		
		HashMap<String,Integer> hm=new HashMap<>();
		
		for(Order s:al)
		{
			if(hm.containsKey(s.city))
			{
				if(s.status.equalsIgnoreCase("pending")) 
				{
					int v=hm.get(s.city)+1;
					hm.put(s.city, v);
				}
			}
			else
				hm.put(s.city, 1);
			
		}
		System.out.println(hm);
	}

}
