package inheritance;

public class Activa extends Bike{

	int weight;
	String modelno,name;
	void setActivaData(int weight,String modelno,String name){
		this.weight=weight;
		this.modelno=modelno;
		this.name=name;
	}
	public String toString() {
		return price+" "+color +" "+model+" "+milage+" "+weight+" "+modelno+" "+name;
	}
	void engine() {
		System.out.println("110cc");
	}
}
