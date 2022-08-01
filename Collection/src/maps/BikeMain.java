package maps;

import java.util.HashMap;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Bike,Integer> m=new HashMap<>();
		m.put(new Bike(111,"Pulsor","black"),125000);
		m.put(new Bike(102,"Bullet","blue"),200000);
		m.put(new Bike(104,"Unicorn","black"),135000);
		m.put(new Bike(107,"KTM","Red"), 200000);
		m.put(new Bike(101,"HeroSplender","black"),85000);
		m.put(new Bike(105,"Apache","Red"), 110000);
		
		System.out.println(m);
		
		
		
	}

}
