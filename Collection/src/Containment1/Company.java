package Containment1;

import java.util.ArrayList;

public class Company {

	int id;
	String name;
	ArrayList<Car>cars;
	Company(int id,String name,ArrayList<Car>cars)
	{
		this.id=id;
		this.name=name;
		this.cars=cars;
	}
	public String toString() {
		return id+" "+name+cars;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
