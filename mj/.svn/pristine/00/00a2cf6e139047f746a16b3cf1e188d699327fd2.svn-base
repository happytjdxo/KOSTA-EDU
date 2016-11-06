package chatt.client;

import java.io.BufferedReader;

import sun.audio.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

import chatt.gui.ChattingGui;

public class ChattClient3 {
	Socket s;
	public BufferedReader br1;
	public PrintWriter pw;
	JOptionPane j = new JOptionPane();
	ChattingGui gui = new ChattingGui(this);
	String name = "";
	
	 AudioStream as;
	 InputStream in;
	
	public void go() {

		while (true) {
			if (name.equals("") || name.equals(null))
				name = j.showInputDialog("닉네임을 입력하세요.");
			else
				break;
		}
		gui.lunchFrame();
		
		//soundCall();
		
		try {
			s = new Socket("192.168.7.108", 60000);
			System.out.println("Client Socket Creating....");
			br1 = new BufferedReader(new InputStreamReader(System.in));
			
			pw = new PrintWriter(s.getOutputStream(), true);
			pw.println(name);
			
			// gui.ta1.setText("["+name+"]"+"님이 입장하셨습니다.");

			// 쓰레드 추가
			ClientThread ct = new ClientThread(s, gui,this);
			ct.start();
		
			// while (true) {
			// String line = br1.readLine();
			// pw.println(line);
			// // //////////////blocking////////////////////
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void soundCall()
	{
		try {
			in = (new FileInputStream("src/코인.wav"));
			System.out.println(in);
			as = new AudioStream(in);
			 AudioPlayer.player.start(as);
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ChattClient3 cc3 = new ChattClient3();
		cc3.go();
	}

}

// 서버가 보낸 데이터만 읽어서 자신의 창으로 로직을 전담하는 쓰레드
class ClientThread extends Thread {
	Socket s;
	BufferedReader br2;
	String str;
	ChattingGui gui;
	ChattClient3 cc3;
	public ClientThread(Socket s, ChattingGui gui,ChattClient3 cc3) {
		this.s = s;
		this.gui = gui;
		this.cc3 = cc3;
	}

	public void run() {
		try {
			br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
			while (true) {
				if(br2.readLine().equals("!!!!!"))
	            {
	               System.out.println("call");
	               cc3.soundCall();
	            }
				String str = br2.readLine();
				
				gui.ta1.append(str + "\n");
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
}
