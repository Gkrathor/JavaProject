package collection;

import java.util.Comparator;

public class SortId implements Comparator<Student>{
	@Override
	public int compare(Student x, Student y)
	{
		return x.getId()-y.getId();
	}
}
