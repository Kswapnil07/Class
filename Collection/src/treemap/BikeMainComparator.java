package treemap;

import java.util.Comparator;

public class BikeMainComparator implements Comparator <Bike> {
	public int compare(Bike b1,Bike b2)
	{
		return b1.name.compareTo(b2.name);
	}

}
