package jspider;

public class Employee {
		private String name;
		private Double sal;
		public Employee(String name, double sal) 
		{
			this.name = name;
			this.sal = sal;
		}
		public String getName() {
			return name;
		}
		public Double getSal() { // return type is non primitive double to call compareTo(); 
			return sal;
		}
		@Override
		public String toString() {
			return "Salary of "+name+" is "+sal;
		}
	
}
