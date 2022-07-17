package Containment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {

	int id,price,year ;
	String name;
	
	Car(int id,int price,String name,int year)
	{
		this.id=id;
		this.price=price;
		this.name=name;
		this.year=year;
	}
	public String toString()
	{
		return id+" "+price+" "+name+" "+year;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Company> c =new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Department");
		int s=sc.nextInt();
		
		for(int i=0;i<s;i++)
		{
			System.out.println("company id name");
			
			int id=sc.nextInt();
			String name=sc.next();
			
			ArrayList<Car> cars=new ArrayList<>();
			for(int j=0;j<2;j++)
			{
				System.out.println("enter car id,price,name,year");
				int cid=sc.nextInt();
				int price=sc.nextInt();
				String cname=sc.next();
				int year=sc.nextInt();
				
				cars.add(new Car(id,price,name,year));
			}
			c.add(new Company(id,name,cars));
			
		}
		for(Company a:c)
		{
			for(Car p:a.cars)
			{
				if(p.year>2000 && p.price>600000)
				{
					System.out.println(p.name+" "+p.price+" "+a.name);
				}
			}
		}
		
		}
}
