package maps;

public class Order {

	int id,total;
	String city,status;
	
	Order(int id,int total,String status,String city)
	{
		this.id=id;
		this.total=total;
		this.status=status;
		this.city=city;
		
	}
	public String toString() {
		return id+" "+total+" "+status+" "+city;
	}
}
