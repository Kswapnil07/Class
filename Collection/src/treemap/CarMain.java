package treemap;


import java.util.Map;
import java.util.TreeMap;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,Car> tm=new TreeMap<>();
		
		tm.put(101,new Car(2015, "swift","Suzuki",800000));
		tm.put(104,new Car(2017, "Wagnor" ,"Suzuki",900000));
		tm.put(103,new Car(2013, "Amaze","Honda",1200000));
		tm.put(107,new Car(2018, "Tigor","Tata",700000));
		tm.put(102,new Car(2012, "HondaCity","Honda",1000000));
		tm.put(108,new Car(2020, "Nexon","Tata",1500000));
		
		
		for(Map.Entry<Integer, Car> ent:tm.entrySet())
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		
		
	}

}
