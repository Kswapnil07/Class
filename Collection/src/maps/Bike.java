package maps;

public class Bike {
	int id;
	String name,color;
	Bike(int id,String name,String color)
	{
		this.id=id;
		this.name=name;
		this.color=color;
				
	}
	public String toString() {
		return id+" "+name+" "+color;
	}
	public int hashCode()
	{
		return id;
		
	}
	public boolean equals(Object o)
	{
		Bike b=(Bike)o;
		if(this.id==b.id)
			return true;
		else
			return false;
	}

}
