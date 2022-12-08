package calci;

import java.util.Scanner;

public class CalciSolution {
	static Scanner s=new Scanner(System.in);
	static int a1;
	static int b1;
	public static void acceptInput() {
		System.err.println("Enter the 1st Element");
		a1=s.nextInt();
		System.err.println("Enter the 2nd Element");
		b1=s.nextInt();
	}
	public static void main(String[] args) {
		Calci1 c=new CalciImp(); //upcasting Abstract
		while(true) {
			System.out.println("Enter the Choice \n1.+\n2.-\n3.* \n4./\n5.Exit");
			int op=s.nextInt(); //1 2 3 4
			if(op>=1 && op<=4) {
				acceptInput();
			}
			switch(op){
			case 1:
				System.err.println(c.add(a1, b1));
				break;
			case 2:
				System.err.println(c.sub(a1, b1));
				break;
			case 3:
				System.err.println(c.mul(a1, b1));
				break;
			case 4:
				System.err.println(c.div(a1, b1));
				break;
			case 5:
				System.err.println("Thank You");
				System.exit(0);
				
			default:
				System.out.println("U hava given invalid input");
				break;
			}
		}
	}
}
