package collection;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Student s1=new Student(101, "gk", 69.6);
		Student s2=new Student(105, "pk", 89.3);
		Student s3=new Student(103, "ak", 99.1);
		Student s4=new Student(102, "jk", 79.4);
		Student s5=new Student(104, "rt", 81.9);

		Map<Integer, Student> m=new  LinkedHashMap<>();
		m.put(s1.getId(),s1);
		m.put(s2.getId(),s2);
		m.put(s3.getId(),s3);
		m.put(s4.getId(),s4);
		m.put(s5.getId(),s5);
		Set<Integer> keys=m.keySet();  //its maintain insertion order
		for(int key:keys)
		{
			System.out.println(m.get(key));
		}
		System.out.println("----------------------------");
		List<Student> l=new ArrayList<Student>();
		for(int key: keys) {
			Student s=m.get(key);
			l.add(s);
		}
		System.out.println("Printing object from list");
		System.out.println("------------------------------");
		for(Student s:l)
		{
			System.out.println(s);
		}
		System.out.println("------------------------------");
		SortName n=new SortName();
		SortId i=new SortId();
		SortMarks sm=new SortMarks();
		while(true) {
			System.out.println("1.SortID \n2.SortName \n3.SortMarks \n4.Exit \nEnter the choice");
			Scanner scan=new Scanner(System.in);
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				Collections.sort(l, i);
				for(Student s:l)
				{
					System.err.println(s);
				}
				break;
			case 2:
				Collections.sort(l, n);
				for(Student s:l)
				{
					System.err.println(s);
				}
				break;
			case 3:
				Collections.sort(l, sm);
				for(Student s:l)
				{
					System.err.println(s);
				}
				break;
			case 4:
				System.err.println("Thank You!!!...");
				System.exit(0);
			default:
				System.err.println("Invalid Choice");
			}
		}

	}
}

