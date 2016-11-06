package chatting.client.step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * Client측 로직.. 이번에도 쓰레드가 필요하다.
 * 내가 메세지를 서버로 던지는 중간에도 서버쪽에서 날리는 메세지를 동시에
 * 받아서 읽을려면 쓰레드를 하나 작성해야 한다.
 * 클라이언트 측 쓰레드 기능 ::
 * 서버가 보낸 데이타를 받아서 클라이언트 창에 출력하는 기능을 전담.
 * 만약에 클라이언트에 쓰레드를 적용하지 않는다면?
 * 무전기처럼 사용될 것이다.
 */
public class ChattClient3 {
	Socket s;
	BufferedReader br1;
	PrintWriter pw;
	
	//서버측 잡다구레한 로직들을 다 여기에..
	
	public void go() {
		try{
			s = new Socket("192.168.7.108", 60000);
			System.out.println("Client Socket Creating.");
			
			br1 = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(), true);
			
			// 쓰레드 추가
			ClientThread ct = new ClientThread(s);
			ct.start();
			
			while(true){
				String line = br1.readLine();
				pw.println(line);
				////////////blocking////////////////////////
				// 여기서 서버가 날리는 데이타는 쓰레드의 몫이다.
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}// go()
	
	public static void main(String[] args) {
		ChattClient3 cc3 = new ChattClient3();
		cc3.go();
		
	}
}

// 서버가 보낸 데이타만 읽어서 자신의 창으로 출력하는 로직을 전담하는 쓰레드.
class ClientThread extends Thread{
	Socket s;
	BufferedReader br2 ;
	String str;

	ClientThread(Socket s){
		this.s = s;
	}
	
	public void run() {
		try{
			br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while(true){
				str = br2.readLine();
				System.out.println("서버가 보낸 메세지 : " + str);
			}
		}catch(Exception e){
			
		}
	}
}