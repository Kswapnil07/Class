package array1;
import java.util.Scanner;
public class AlternateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the array element"); 
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i=i+2) {
		System.out.println(a[i]);
	}
	}
}
