package thread.join5.test;
 class JoinThread extends Thread{
	 static int i = 10;
	 public void run(){
		 JoinThread.i = 500;
	 }
 }
public class JoinThreadTest1 {
	public static void main(String[] args) throws InterruptedException{
		JoinThread join = new JoinThread();
		join.start();
		
		join.join();	// main thread를 blocking 시키는 효과가 난다.
		// join이란 쓰레드가 수행을 마치기 전까지 main 이 무작정 기다려야 한다.
		// 일종의 동기화 효과.  <<< main 이 덤비지 못하게 한다.(main을 잡아둘때 쓰는거) >>>
		
		System.out.println(JoinThread.i);	// 500이 나온건 JoinThread가 먼저 돌았다는거임	즉! 어떤 쓰레드가 먼저 도냐에 따라 결과값이 달라짐.
		
	}
}
