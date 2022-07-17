package array1;
import java.util.Scanner;
public class AQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
			System.out.println("enter the size");
			int size=sc.nextInt();
			int a[]=new int[size];
			System.out.println(" enter the array element");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
				
			}
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			
				if(a[i]>0) {
					System.out.println("pos");
				}
				else if(a[i]<0) {
					System.out.println("neg");
				}
				else {
					System.out.println("zero");
				}
				if(a[i]%2==0) {
					System.out.println("even");
					
				}
				else {
					System.out.println("odd");
				}
			}
		
	}
}

