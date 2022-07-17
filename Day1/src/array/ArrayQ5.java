package array;
import java.util.Scanner;							//Take 20 integer inputs from user and print the following:
													//number of positive numbers
														//number of negative numbers
															//number of odd numbers
															//number of even numbers
																//number of 0s.
public class ArrayQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of element array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("enter the element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
			if(arr[i]>0) {
				System.out.println("pos");
			}
				else if(arr[i]<0) {
					System.out.println("neg");
				
			}
			else {
				System.out.println("zero");
			}
			if(arr[i]%2==0) {
				System.out.println("even");
			}
			else  {
				System.out.println("odd");
			}
			
			}
		}
	
	}


