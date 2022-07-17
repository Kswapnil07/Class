package array;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("enter size of array");
		int size=sc.nextInt();
	    int a[]=new int [size];
	    System.out.println("enter array element");
	    for(int i=0;i<a.length;i++) {
	    	a[i]=sc.nextInt();
		    

	    }
	    for(int i=0;i<a.length;i++) {
	    	sum=sum+a[i];
	    }
	    System.out.println( "addition of sum:" +sum);
	}

}
