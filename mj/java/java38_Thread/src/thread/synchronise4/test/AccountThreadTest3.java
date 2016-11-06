package thread.synchronise4.test;
class Account{
	int balance = 1000;	// 만원단위
	
	public void withdraw(int money) throws InterruptedException{
		if(balance >= money){
			Thread.sleep(2000);	
			balance -= money;
		}
	}
	
	/*public void deposit(int money) {
		balance += money;
	}
	*/
}	// Account

class AccountThread implements Runnable{
	Account acc = new Account();
	
	@Override
	public void run() {	//계좌이체..(출금 + 입금)
		while(acc.balance>0){
			// 100, 200, 300만원 중에서 하나의 값이 출금되도록
			int money = (int)(Math.random()*3 +1)*100;	// +1은 왜 하는거임??
			try{
			acc.withdraw(money);
			System.out.println("당신의 통장 잔액은 " + acc.balance + "만원 입니다.");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			//acc.deposit(money);
			System.out.println("당신의 통장 잔액은 " + acc.balance + "만원 입니다.");
		}
	}
}
public class AccountThreadTest3 {
	public static void main(String[] args) {
		AccountThread act = new AccountThread();
		
		Thread t1 = new Thread(act);
		Thread t2 = new Thread(act);
		
		t1.start();
		t2.start();
	}
}
