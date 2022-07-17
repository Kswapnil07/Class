package whileloopexap;
import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		num=sc.nextInt();
		
		while(num>0) {
			int r=num%10;
			i=i*10+r;
			num=num/10;
		}
		System.out.println("reverse number :" +i);

	}

}
