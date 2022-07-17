package arrayOfObject;

import java.util.Scanner;

public class DriverObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver de []=new Driver[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter the contact");
			String contact=sc.next();
			
			de[i]=new Driver(id, contact, name);
			
		}
		for(Driver d:de) {
			System.out.println(d);
		}
		
	}

}
