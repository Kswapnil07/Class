package arraylist;

import java.util.ArrayList;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<>();
		
		al.add("sun");
		al.add("mon");
		al.add("sun");
		al.add("tue");
		al.add("wed");
		al.add("mon");
		
		System.out.println(al);
		
		ArrayList<String>a=new ArrayList<>();
		
		for(int i=0;i<al.size();i++)
		{
			int cnt=0;
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i)==al.get(j)&& j<i )
				{
				break;
				}
					
				
				else if(al.get(i)==al.get(j)&& j>=i)
				{
					cnt++;
				}
			}
				if(cnt!=0)
				{
					a.add(al.get(i));
				}
				
			}
		System.out.println(a);
			
		}
		
		
	}


