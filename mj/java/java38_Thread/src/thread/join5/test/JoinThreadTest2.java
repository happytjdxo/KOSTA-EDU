package thread.join5.test;

class JoinThread2 extends Thread{
	private int first, last;
	public int sum;
	
	public JoinThread2(int first, int last) {
		super();
		this.first = first;
		this.last = last;
	}
	public void run(){
		for(int i = first; i<=last; i++) {
			sum += i;
			System.out.println("CurrentThread : " + Thread.currentThread().getName());
		}
	}
	
}
public class JoinThreadTest2 {
	public static void main(String[] args) throws InterruptedException{
		JoinThread2 t1 = new JoinThread2(1, 5);		//15
		JoinThread2 t2 = new JoinThread2(6, 10);	//40
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
		System.out.println("t1의 Sum은 : " + t1.sum);
		System.out.println("t2의 Sum은 : " + t2.sum);
	}
}
