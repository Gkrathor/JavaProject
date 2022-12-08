package bank;
import java.util.Scanner;
public class BankRunner {
	static Scanner s=new Scanner(System.in);
	static int a1;
	public static void main(String[] args) {
		Bank b=new BankImp();
		while(true) {
			System.out.println("1.Deposite \n2.Withdraw \n3.CheckBalance\n4.Exit \nEnter the Choice");
			int op=s.nextInt();
			switch(op){
			case 1:
				System.err.println("Enter the Amount to Deposit");
				b.deposite(a1=s.nextInt());
				System.out.println("Deposit Balance Available is Rs:"+b.checkbalanee());
				break;
			case 2:
				System.err.println("Enter the Amount to Withdraw");
				b.withdraw(a1=s.nextInt());
				System.out.println("Deposit Balance Available is Rs:"+b.checkbalanee());
				break;
			case 3:
				System.out.println("Available Balance is Rs:"+b.checkbalanee());
				break;
			case 4:
				System.err.println("Thank You!!!.. S00n Visit to our Bank");
				System.exit(0);
				
			}
		}
	}
}