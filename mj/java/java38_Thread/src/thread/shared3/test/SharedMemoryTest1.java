package thread.shared3.test;

/*
 * Thread들은 Process의 자원을 서로 공유하면서 돌아간다는 의미를
 * 알수 있는 로직을 작성 하겠다.
 */
class Calculator{
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;	// 100	----->	50
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		} //catch
		System.out.println(Thread.currentThread().getName()+ " : " + this.memory);
//		System.out.println(Thread.currentThread().getName()+ " : " + memory);
	}
}
class User1 extends Thread{
	Calculator calculator;

	public void setCalculator(Calculator calculator) {
		setName("CalculatorUser1");
		this.calculator = calculator;
	}	// hasing 하기위해 set를 생성
	public void run(){
		calculator.setMemory(100);
	}
}

class User2 extends Thread{
	Calculator calculator;

	public void setCalculator(Calculator calculator) {
		setName("CalculatorUser2");
		this.calculator = calculator;
	}	// hasing 하기위해 set를 생성
	public void run(){
		calculator.setMemory(50);
	}
}
public class SharedMemoryTest1 {
	public static void main(String[] args) {
		Calculator cc = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(cc);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(cc);
		user2.start();
		
	}
}
