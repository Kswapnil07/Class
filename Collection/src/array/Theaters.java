package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Theaters {

	int id,collection;
	String name,nomovi;
	
	Theaters(int id,int collection ,String name,String nomovi)
	{
		this.id=id;
		this.collection=collection;
		this.name=name;
		this.nomovi=nomovi;
		
	}
	public String toString() {
		return id+" "+collection+" "+name+" "+nomovi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Theaters> al=new ArrayList<>();
		
		al.add(new Theaters(101,100000,"pvr","4"));
		al.add(new Theaters(102,500000,"Inox","4"));
		al.add(new Theaters(103,800000,"citypride","4"));
		al.add(new Theaters(104,500000,"yashoda","4"));
		
		Theaters ai[]=new Theaters[al.size()];
		
		al.toArray(ai);
		System.out.println(Arrays.toString(ai));
		//System.out.println(al);
		
		for(Theaters th:al)
		{
			if(th.name.startsWith("I"))
			{
				System.out.println(th.name+" "+th.collection);
			}
		}

		
	}

}
