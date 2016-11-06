package gui.component.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class ChattClientTest2 {
		private Frame f;
		private Panel p;
		private Button send, quit;
		private TextField tf;
		private TextArea ta;
		
		public ChattClientTest2(){
			f = new Frame("Chatting Room");
			p = new Panel();
			send = new Button("send");
			quit = new Button("Quit");
			tf = new TextField(50);
			ta = new TextArea(10, 50);
		}
		
		public void lunchFrame(){
			p.add(send); 
			p.add(quit);
			f.add(p,"Center");
			f.add(ta,"West");
			f.add(tf,"South");
			
			f.setSize(440, 210);
			f.setVisible(true);
		}
		public static void main(String[] args) {
			ChattClientTest2 test = new ChattClientTest2();
			test.lunchFrame();
	}
}
