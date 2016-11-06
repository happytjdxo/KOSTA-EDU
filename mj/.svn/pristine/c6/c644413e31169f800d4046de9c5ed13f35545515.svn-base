package chatting.server.step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 * 서버에 접속한 여러명의 클라이언트와 메세지를 주고받을 수 있는 Server측 로직을
 * 작성.
 * 여러명의 클라이언트와 서비스를 하기 위해서 서버사이드에 Thread가 도입되어야 한다.
 * 여기서 Process / Thread 의 차이점을 명확히 하기 위해서 필드 선언을 정확하게 하자.
 */
public class ChattServer3 { //Server side Process(서버측에서 돌아가는 실행 파일)
	ServerSocket server;
	Socket s;
	ArrayList<ServerThread> list;

	ChattServer3(){
		list = new ArrayList<ServerThread>();
	}


	//클라이언트가 접속하면 소켓이 만들어지고, 쓰레드가 생성, 리스트에 쓰레드가 추가
	//Thread를 리스트에 추가하는 기능
	public void addThread(ServerThread st){
		list.add(st);
	}

	//Thread를 리스트에서 삭제하는 기능
	public void removeThread(ServerThread st){
		list.remove(st);
	}

	//Client가 보낸 메세지를 연결된 모든 클라이언트(리스트에 저장된 쓰레드)에게 뿌리는 기능
	public void broadcast(String message){
		for(ServerThread st : list){
			st.sendMessage(message);
		}
	}

	//서버측 잡다구레한 로직들은 다 여기에
	public void go() throws Exception{
		server = new ServerSocket(60000);
		System.out.println("Server Ready....port number 60000....");
		while(true){ //윙윙윙(무한루핑)
			s = server.accept(); //접속을 하는순간 소켓을 만듦
			ServerThread st = new ServerThread(s, this);
			this.addThread(st);
			st.start();
		}
	}

	public static void main(String[] args) throws Exception {
		ChattServer3 cs3 = new ChattServer3();
		cs3.go();
	}
}

//Server side Thread
class ServerThread extends Thread{
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChattServer3 cs3;

	public void sendMessage(String str){
		//서버에서 받은 메세지를 창으로 출력. 스트림이 만들어져 있어야한다.
		pw.println(str); //자신의 창으로 메세지 출력

	}

	ServerThread(Socket s, ChattServer3 cs3){
		this.s = s;
		this.cs3 = cs3;
		System.out.println(s.getInetAddress()+"님이 접속하셨습니다.");
		cs3.broadcast(s.getInetAddress()+"님이 들어오셨습니다.");
	}

	public void run(){
		try{
			//스트림 생성
			/*
			 * 클라이언트가 보낸 데이터를 읽어서 
			 * 다시 클라이언트로 뿌린다.
			 */
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			while(true){
				String line = br.readLine();
				cs3.broadcast(line); //이게 채팅
			}
		}catch(Exception e){
			//클라이언트의 연결이 끊어졌을때의 로직을 작성
			System.out.println(s.getInetAddress()+"님의 연결이 끊어졌습니다.");
			cs3.broadcast(s.getInetAddress()+"님이 방을 나가셨습니다.");
			cs3.removeThread(this);
		}
	}
}

/*
 * broadcast() / sendMessage()를 나누는 이유
 */