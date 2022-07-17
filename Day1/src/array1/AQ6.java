package array1;
import java.util.Scanner;
public class AQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array element");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("sum of product");
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum);
	}

}
