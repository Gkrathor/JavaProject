package bank;

public interface Bank {
	void deposite(int amt);
	void withdraw(int amt);
	int checkbalanee();
	String displayErrorMessage();
}

