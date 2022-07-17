package array;
import java.util.Scanner;
public class MulOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<arr.length;i++) {
			mul=mul*arr[i];
			
		}
		System.out.println(mul);
	}

}
