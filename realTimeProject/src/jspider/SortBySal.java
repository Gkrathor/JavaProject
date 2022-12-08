package jspider;

import java.util.Comparator;

public class SortBySal implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2)
	{
		//Double i=x.getSal();
		//Double j=y.getSal();
		//return i.compareTo(j);
		return e1.getSal().compareTo(e2.getSal());
	}

}
//e1=Object to be inserted
//e2=Already existing Object
//in order to compare object and double object we -
//-always use comparTo() of those respective class -
//-and all wrapper classes  

