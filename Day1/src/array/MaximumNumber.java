package array;
import java.util.Scanner;
public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("enter the array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();		
			}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) 
				max=arr[i];
			
			
		}
		System.out.println(max);
	}
	

}
