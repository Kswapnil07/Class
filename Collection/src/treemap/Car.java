package treemap;

public class Car {

	int year, price;
	String name,brand ;
	Car(int year,String name,String brand,int price)
	{
		this.year=year;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	public String toString() {
		return year+" "+name+" "+brand+" "+price;
		
	}
}
