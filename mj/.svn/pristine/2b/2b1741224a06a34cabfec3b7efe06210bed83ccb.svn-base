package bankcondition.step2.test;
public class BankingTest {
	public static void main(String[] args) {
		// 명시적 생성자가 있을때는 컴파일러가 대신 넣어주지 않는다.. 기본생성자를..
		Account account = new Account();
		Account account1 = new Account(10000.0);

		account1.deposit(800);	// 안됨
		account1.deposit(8000);
		account1.deposit(3000);
		account1.withdraw(22000); // 안됨
		account1.withdraw(2000.0);
		System.out.println("현재 잔액 :" + account1.getBalance()+ "$");
	}
}//class

class Account{
	private double balance;
	// 씨티은행은 최초 입금액이 적어도 1만원 이상이어야 통장이 개설된다.
	public Account(){}
	public Account(double balance) {
		if(balance>=10000.0){
			this.balance = balance;
		}else{
			System.out.println("최초 입금액은 적어도 1만원 이상!!");
			return;
		}
	}
	// setter 가 지금은 필요없다.. 생성자를 통해서 주입되었다.. balance
	public double getBalance() {
		return balance;
	}

	// 입금.. 1천원 이상..
	public void deposit(double money){
		if(money >= 1000.0)
			balance += money;
	}

	// 출금..잔액보다 작거나 같은금액..
	public void withdraw(double money){
		if(money <= balance)
			balance -= money;
		else
			System.out.println("인출하려는 금액이 너무 큽니다.");
	}
}
