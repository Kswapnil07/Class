package generic;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Float> a1=new ArrayList<>();
		
		a1.add(30f);
		a1.add(25f);
		a1.add(15f);
		a1.add(10f);
		System.out.println(a1);
		
		
		float sum=0f;
		
		for(int i=0;i<a1.size();i++)
		
			sum=sum+a1.get(i);
		
		float avg=sum/a1.size();
		
		System.out.println(avg);
	}

}
