package self;

import self.banking.Account;
import self.banking.Customer;

class BankingTest2{
	public static void main(String[] args)	{
		System.out.println("=============Banking Has a Relation============\n");
	
	//	1. 고객을 하나 생성, James Gosling이 되도록
		Customer cust = new Customer();
		cust.setFirstName("James");
		cust.setLastName("Gosling");

	//	2. James가 통장을 하나 개설,, 이때 잔액이 10000.0원이 되도록
	//	3. 2번에서 James는 잔액이 일만원인 통장을 가지게 된다.. 개설함	
		//Account acc = new Account(10000.0);	//씨티은행
//		acc.setBalance(10000.0);
		cust.setAccount(new Account(10000.0));	// 이때 비로소 James가 통장을 개설한 것이 된다.       ---->..??

	//	4. James가 개설한 통장에 돈을 7000원 입금
	//								  2500원 입금
	//								  4000원 출금
		Account acc2 = cust.getAccount();
		System.out.println("---James 7000원 입금---");
		acc2.deposit(7000.0);
		System.out.println("---James 2500원 입금---");
		acc2.deposit(2500.0);
		System.out.println("---James 4000원 출금---");
		acc2.withdraw(4000.0);

	//	5. 마지막으로 James의 통장 잔액을 출력해 본다.
		System.out.println("\n James의 통장 잔액 ::" +acc2.getBalance());

/*
		// 1.
			Customer cu = new Customer();
			cu.setFirstName("James");
			cu.setLastName("Gosling");
			System.out.println(cu);
*/		
	}
}
