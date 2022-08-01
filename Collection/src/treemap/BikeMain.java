package treemap;

import java.util.TreeMap;
public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Bike,Integer> tm=new TreeMap<>(new BikeMainComparator());
		tm.put(new Bike(111,"Pulsor","black"),125000);
		tm.put(new Bike(102,"Bullet","blue"),200000);
		tm.put(new Bike(104,"Unicorn","black"),135000);
		tm.put(new Bike(107,"KTM","Red"), 200000);
		tm.put(new Bike(101,"HeroSplender","black"),85000);
		tm.put(new Bike(105,"Apache","Red"), 110000);
		
		System.out.println(tm);
		//System.out.println(tm.containsKey(new Bike(107,"KTM","Red")));
	}

}
