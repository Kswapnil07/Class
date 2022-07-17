package whileloopexap;
import java.util.Scanner;
public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
System.out.println("enter the num");
int num=sc.nextInt();
int i;
int evensum=0;

for(i=1;i<num;i++) {
	if(i%2==0) {
		
		evensum=evensum+i;
	}
}
System.out.println(evensum);

	}

}
