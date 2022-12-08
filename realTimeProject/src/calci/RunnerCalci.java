package calci;
import java.util.*;
public class RunnerCalci {
	public static void main(String[] args) {
		Calci1 c=new CalciImp();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number to be perform \n1.+\n2.-\n3.* \n4./");
		int op=s.nextInt();
		System.err.println("Enter the value of a , b ");
		int a1=s.nextInt();
		int b1=s.nextInt();
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
		default:
			System.out.println("U hava given invalid input");
			break;
		}
	}
}
