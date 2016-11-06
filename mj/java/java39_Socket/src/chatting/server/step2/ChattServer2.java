package chatting.server.step2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * client가 보낸 메세지를 받아서 / 
 * 다시 클라이언트로 뿌린다.
 */
public class ChattServer2 {
	// 필드 선언

	ServerSocket server;
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	
	public void go(){
		try{
			server = new ServerSocket(60000);
			System.out.println("Server Ready..");
			
			s = server.accept();
			System.out.println(s.getInetAddress()+"님이 접속 하셨습니다..");

			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(), true);
			System.out.println("Creating Stream.. by socket..2");
			
			while(true){
				String line = br.readLine();
				pw.println(line);
			}
		}catch(Exception e){
			System.out.println("연결이 끊어졌습니다..");
		}
	}

	public static void main(String[] args){
		ChattServer2 cs2 = new ChattServer2();
		cs2.go();
	}
}
