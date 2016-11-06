package chatting.client.step2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


/*
 * 키보드로 입력한 데이타를 읽어서 / 
 * 서버측으로 날리는 로직
 * ========================
 * 서버가 다시 던지는 데이타를 받아서
 * 자신의 콘솔창으로 출력한다.
 */
public class ChattClient2 {
	// 필드 선언
	Socket s;
	BufferedReader br1, br2;
	PrintWriter pw;

	public void go(){
		try{
			s = new Socket("192.168.7.108", 60000);
			System.out.println("Clinet socket Creating..");

			br1 = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(),true);
			br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));

			while(true){
				// 이부분의 로직을 잘 이해하셔야 합니다. 의외로 간단 합니다..
				String line = br1.readLine();
				pw.println(line);	// 서버로 날라간다.
				///////////////////// 서버에서 던진걸 다시 읽어들이기 전까지 Blocking 당한다.
				String serverLine = br2.readLine();
				System.out.println("서버가 보낸 메세지 : " + serverLine);
			}

		}catch(Exception e) {

		}

	}
	public static void main(String[] args) {
		ChattClient2 cc2 = new ChattClient2();
		cc2.go();
	}
}

