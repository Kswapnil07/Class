package nongeneric;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		a1.add(40);
		a1.add(2.5f);
		a1.add("raj");
		a1.add(60);
		a1.add(80);
		a1.add("riya");
		a1.add(78.5f);
		a1.add(new stud(101,70," ram"));
		
		System.out.println(a1);
		
		
//		for(int i=0;i<a1.size();i++)
//		{
//			a1.get(i);
//		}
		for(Object o:a1)
		{
			String s=o.getClass().getName();
			if(s.equalsIgnoreCase("java.lang.String"))
			System.out.println(o);
		}
	}

}
