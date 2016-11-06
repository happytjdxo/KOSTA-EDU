package self.banking;

public class Account{
	double balance;
/*
	public void setBalance(double money){
		balance = money;
	}
*/

	public Account(double money){
		balance = money;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double money){
		balance += money;
	}
	public void withdraw(double money){
		balance -= money;
	}
} 
