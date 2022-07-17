package array1;

import java.util.Scanner;

public class MinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element");

		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(min);
	}

}
