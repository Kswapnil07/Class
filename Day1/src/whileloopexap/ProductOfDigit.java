package whileloopexap;
import java.util.Scanner;
public class ProductOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int product=1;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);

int num=sc.nextInt();
while(num>0) {
	
	int p=num%10;
	product=product*p;
	num=num/10;
	
}
System.out.println("product of digit:"+ product);
	}

}
