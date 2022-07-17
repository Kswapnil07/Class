package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwapp {

	void array(int a[],int size) {
		int c=size/2;
	
		for(int i=0;i<size/2;i++) {
			int temp=a[i];
			a[i]=a[c];
			a[c]=temp;
			c++;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size of array");
//		int size=sc.nextInt();
//		int a[]=new int[size];
//		System.out.println("enter array element");
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//	}
//		ArraySwapp a1=new ArraySwapp();
//		a1.array(a,size);
	}
}
