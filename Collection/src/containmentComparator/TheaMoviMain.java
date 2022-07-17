package containmentComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TheaMoviMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Theater> th=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of theater");
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			System.out.println("enter Theater id, name");
			int id=sc.nextInt();
			String name=sc.next();
			
			ArrayList<Movie> m=new ArrayList<>();
			
			for(int j=0;j<3;j++)
			{
				System.out.println("enter Movie mid,boxofficecollection ,mname,rating");
				int mid=sc.nextInt();
				int boxofficecollection=sc.nextInt();
				String mname=sc.next();
				int rating =sc.nextInt();
				
			m.add(new Movie (mid,boxofficecollection ,mname,rating));
			//System.out.println(m);
			Collections.sort(m);
			
			}
			th.add(new Theater (id,name, m));
		}
		
		System.out.println(th);
		
		
	}

}
