package inheritance;
import java.util.Scanner;
public class BikeActiveMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter price,color,model,milage,weight,modelno,name");
		int price=sc.nextInt();
		String color=sc.next();
		String model=sc.next();
		String milage=sc.next();
		int weight=sc.nextInt();
		String modelno=sc.next();
		String name=sc.next();
		
		Activa1 a=new Activa1();
	
		a.setPrice(price);
		a.setColor(color);
		a.setModel(model);
		a.setMilage(milage);
		a.setWeight(weight);
		a.setModelno(modelno);
		a.setName(name);
		
		System.out.println(a);
		
		
	}

}
