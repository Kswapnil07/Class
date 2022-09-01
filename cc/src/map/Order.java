package map;

public class Order {

		int id,total;
		String status,city;
		
		Order(int id,String status,String city,int total)
		{
			this.id=id;
			this.status=status;
			this.city=city;
			this.total=total;
		}
		public String toString()
		{
			return id+" "+status+" "+city+" "+total;
		}
		
		
	}


