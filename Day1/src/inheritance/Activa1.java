package inheritance;

public class Activa1 extends Bike1 {

	int weight;
	String modelno,name;
	
	public int getWeight() {
		return weight;	
	}
	public void setWeight(int weight) {
		this.weight=weight;	
	}
	public String getModelno() {
		return modelno;
	}
	public void setModelno(String modelno) {
		this.modelno=modelno;
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String toString() {
		return price+" "+color+" "+model+" "+milage+" "+weight+" "+modelno+" "+name; 
	}
	
	
}
