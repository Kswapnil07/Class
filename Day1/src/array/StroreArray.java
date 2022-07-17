package array;
import java.util.Scanner; //A.Q1 Take 10 integer inputs from user and store them in an array and print them
//on screen.

public class StroreArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new 	Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int  a[]=new int[size];
		System.out.println("enter the array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array element");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		//System.out.println();
	}

}
