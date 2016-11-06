package gui.component.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FourButtonTest1{
	private Frame f;
	private Panel p;
	private Button b1, b2, b3, b4;
	private TextField tf;
	
	public FourButtonTest1() {
		f = new Frame("four Button");
		b1 = new Button("나정이");
		b2 = new Button("칠봉이");
		b3 = new Button("쓰레기");
		b4 = new Button("빙그레");
		p = new Panel();
		tf = new TextField(30);	//	보여지는 글자의 갯수 , 가로 사이즈가 지정됨.
	}
	
	public void lunchFrame(){
		p.add(b1); p.add(b2); p.add(b3); p.add(b4);
		f.add(p,"North");
		f.add(tf,"South");
		
		f.setSize(400, 300);
		f.setBackground(Color.GRAY);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		FourButtonTest1 test = new FourButtonTest1();
		test.lunchFrame();
	}
}