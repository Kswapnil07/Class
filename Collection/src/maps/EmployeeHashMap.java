package maps;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Employee> hm=new HashMap<>();
		hm.put(101,new Employee("raj","Hr",70000));
		hm.put(102,new Employee("ram","Sales",65000));
		hm.put(104,new Employee("ajay","Development",50000));
		hm.put(121,new Employee("vijay","Hr",65000));
		hm.put(111,new Employee("ramesh","Testing",65000));
		hm.put(112,new Employee("ramakant","Sales",75000));
		hm.put(105,new Employee("swapnil","Hr",77000));
		hm.put(106,new Employee("shri","Service",68000));
		hm.put(109,new Employee("raj","Development",80000));
		hm.put(100,new Employee("ram","Hr",67000));
		hm.put(null, new Employee("krushna","Development",85000));
		
		//System.out.println(hm);
		
		for(Map.Entry<Integer, Employee> ent:hm.entrySet())
		{
			if(ent.getValue().dept.equalsIgnoreCase("Hr"))
				System.out.println(ent.getKey()+" "+ent.getValue().name+" "+ent.getValue().salary+" "+ent.getValue().dept);
		}
		
	}

}
