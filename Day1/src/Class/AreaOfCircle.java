package Class;
import java.util.Scanner;


public class AreaOfCircle {

	int rSquare(int r) {
		return r*r;
		
	}
	void area (int r) {
		double area=3.14*rSquare(r);
		System.out.println(area)  ; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle");
		int r=sc.nextInt();
		AreaOfCircle c1= new AreaOfCircle();
		c1.area(r);
	}

}
