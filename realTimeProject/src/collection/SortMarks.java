package collection;

import java.util.Comparator;

public class SortMarks implements Comparator<Student>{
		@Override
		public int compare(Student x, Student y)
		{
			return (int) (x.getMarks()-y.getMarks());
		}
}
