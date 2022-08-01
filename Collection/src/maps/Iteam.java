package maps;

public class Iteam {

	int id,cost;
	String name,company;
	Iteam(int id,String name,String company,int cost)
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.cost=cost;
	}
	public String toString()
	{
		return id+" "+name+" "+company+" "+cost;
	}
}
