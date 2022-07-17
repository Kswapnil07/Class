package array;

import java.util.Scanner;

public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]<min)
				min=arr[0];
				
		}
		System.out.println(min);
		
	}

}
