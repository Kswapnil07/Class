package array1;
import java.util.Scanner;
public class PresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();

		}
		System.out.println("array element");
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
			System.out.println("search array element");
			int n=sc.nextInt();
			for(int i=0;i<a.length;i++) {
				if(a[i]==n) {
					c++;
					
				}
			}
				if(c>0) {
					System.out.println("present");
				}
				else 
					System.out.println("not present");
				}
				
		}
	
	


