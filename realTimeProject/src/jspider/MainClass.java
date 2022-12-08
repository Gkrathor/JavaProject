package jspider;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		SortByName sn=new SortByName();
		SortBySal ss=new SortBySal();
		Employee e1=new Employee("GK",  456287.88);
		Employee e2=new Employee("JK",  556287.88);
		Employee e3=new Employee("RKI", 465987.88);
		Map<String, Employee> m=new LinkedHashMap();
		m.put(e1.getName(),e1);
		m.put(e2.getName(),e2);
		m.put(e3.getName(),e3);
		Set<String> keys=m.keySet(); //Converting map into a set of key
		List<Employee> l=new ArrayList<Employee>(); //      creating a instance if Arraylist
		for(String key:keys) //adding all value ->Employee object from map(LHM)into (AL)
		{	
			l.add(m.get(key)); //adding in map to Al
		}
		for(Employee emp:l)
		{ 
			System.err.println(emp); //traverse all employee object from Al
		}
		System.err.println("---------------");
		while(true) {
			System.err.println("1.SortByName \n2.SortBySal \n3.Exit \nEnter the Choice");
			Scanner s=new Scanner(System.in);
			int op=s.nextInt();
			switch(op)
			{
			case 1:
				Collections.sort(l,sn);
				for(Employee e: l)
				{
					System.err.println(e);
				}
				break;
			case 2:
				Collections.sort(l,ss);
				for(Employee e: l)
				{
					System.err.println(e);
				}
				break;
			case 3:
				System.err.println("Thank You");
				System.exit(0);
			}


		}
	}
}
