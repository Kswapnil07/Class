package array;

import java.util.ArrayList;
import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			al.add(1);
			al.add(2);
			al.add(3);
			al.add(4);
		}
		for(int j=0;j<10;j++)
		{
			if(j%2==0)
			{
				System.out.println(j);
			}
		}
	}

}
