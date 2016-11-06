package chatt.server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class ChattServer3 {
	ServerSocket server;
	Socket s;
	ArrayList<ServerThread> list;

	ChattServer3() {
		list = new ArrayList<ServerThread>();
	}

	public void addThread(ServerThread st) {
		list.add(st);
	}

	public void removeThread(ServerThread st) {
		list.remove(st);
	}

	public void broadcast(String message) {
		for (ServerThread st : list)
			st.sendMessage(message);
	}

	public void go() throws Exception {
		server = new ServerSocket(60000);
		System.out.println("ServerReady....Portnumber 60000....");
		while (true) {
			s = server.accept();
			ServerThread st = new ServerThread(s, this);
			addThread(st);
			st.start();
		}

	}

	public static void main(String[] args) throws Exception {
		ChattServer3 cs3 = new ChattServer3();
		cs3.go();
	}

}

class ServerThread extends Thread {
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChattServer3 cs3;
	String name;

	public ServerThread(Socket s, ChattServer3 cs3) {
		this.s = s;
		this.cs3 = cs3;

	}

	public void sendMessage(String message) {

		pw.println(message);
	}

	public void run() {
		try {

			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(), true);
			
			name = br.readLine();
			cs3.broadcast("!!!!!");
			System.out.println(s.getInetAddress() + " 님이 접속하셨습니다.");
			cs3.broadcast("[" + name + "]" + "입장하셨습니다.");

			while (true) {
				String line = br.readLine();
				cs3.broadcast("[" + name + "]" + ":: " + line);
			}
		} catch (Exception e) {
			System.out.println(s.getInetAddress() + " 님의 연결이 끊어졌습니다.");
			cs3.broadcast("[" + name + "]" + "님이 퇴장하셨습니다.");
			cs3.removeThread(this);
		}

	}
}
