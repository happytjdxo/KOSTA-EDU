package self;

import self.banking.Account;

public class TestBanking {

  public static void main(String[] args) {
    
    // Create an account that can has a 500.00 balance.
    System.out.println("Creating an account with a 500.00 balance.");
    Account account = new Account();
	account.setBalance(500.0);

    System.out.println("Withdraw 150.00");
    account.withdraw(150.00);

    System.out.println("Deposit 22.50");
    account.deposit(22.50);

    System.out.println("Withdraw 47.62");
    account.withdraw(47.62);

    // Print out the final account balance
    System.out.println("The account has a balance of " + account.getBalance());
  }
}
