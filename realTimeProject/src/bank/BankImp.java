package bank;
import java.util.*;
public class BankImp implements Bank{
	private int balance;
	public void Bankimp(int balance){
		this.balance=balance;
	}
	public void deposite(int amt) {
		System.err.println("Your Balance is: "+(balance+=amt));
		System.err.println("Succesfully Depositing Amount "+balance);
	}
	public void withdraw(int amt)  {
		if(amt<=balance) {
			System.err.println("Your Balance is: "+(balance-=amt));
			System.err.println("Succesfully Withdraw Amount "+balance);
		}
		else { 
			try {
				throw new InsufficentBalance("Low Balance Can't Withdraw"); 
			}
			catch(Exception e)
			{
				System.err.println(e.getMessage());
			}
		}
	}
	public int checkbalanee() {
		return balance;
	}
	public String displayErrorMessage() {
		return "Invalid Choice Kindly Enter Valid Choice";
	}
}
