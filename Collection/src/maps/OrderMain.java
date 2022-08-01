package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Order> al=new ArrayList<>();
		
		
		al.add(new Order(102,20,"delivered","mumbai"));
		al.add(new Order(103,30,"pending","nagpur"));
		al.add(new Order(104,40," pending","mumbai"));
		al.add(new Order(101,10,"pending","pune"));
		al.add(new Order(102,20,"delivered","mumbai"));
		al.add(new Order(103,30,"pending","pune"));
		al.add(new Order(104,40,"pending","satara"));
		al.add(new Order(105,80,"pending","mumbai"));
		
		//System.out.println(al);
		HashMap<String ,Integer> hm=new HashMap<>();
		
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
		{
			hm.put(s.city, 1);
		}
			}
		
		System.out.println(hm);
		}
}


