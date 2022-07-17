package array;//A.Q2 WAP to print the alternate values from an array.
import java.util.Scanner;
public class AlternateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("enter the element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
	}

}
