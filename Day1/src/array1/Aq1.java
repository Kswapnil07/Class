package array1;
import java.util.Scanner;
public class Aq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		
		}
		System.out.println("array element");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		
	}

}
