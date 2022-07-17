package array;
import java.util.Scanner;
public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of element");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("enter the array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			System.out.println(arr[i]);
		}
	}

}
