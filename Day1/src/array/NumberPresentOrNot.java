package array;  //A.q3=Take 10 integer inputs from user and store them in an array. Again ask user
//to give a number. Now, tell user whether that number is present in array or
//not.
import java.util.Scanner;
public class NumberPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("enter the array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int cnt=0;
		
		System.out.println("array element");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(+arr[i]+" ");			
	}
		System.out.println("search element");
		
			int n=sc.nextInt();	
			for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==n) {
				cnt++;
			}	
			}
			if(cnt>0) 
				System.out.println("present");
			
			else 
				System.out.println("not present");
			
			}
	}

