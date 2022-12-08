package collection;

import java.util.Comparator;

public class SortName implements Comparator<Student>{
		@Override
		public int compare(Student x, Student y)
		{
			return x.getName().compareTo(y.getName());
		}

		
}
