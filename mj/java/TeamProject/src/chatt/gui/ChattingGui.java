package chatt.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import chatt.client.ChattClient3;

public class ChattingGui {
	// 1.gui구성
	Frame f;
	Panel p1;
	TextField tf;
	public TextArea ta1;
	Button b1, b2, b3;
	ChattClient3 cc3;

	public ChattingGui(ChattClient3 cc3) {
		this.cc3 = cc3;
		
		f = new Frame("Chatting Room");
		tf = new TextField(30);
		ta1 = new TextArea();
		b1 = new Button("전송");
		b2 = new Button("저장");
		b3 = new Button("초기화");
		p1 = new Panel();
	}

	public void lunchFrame() {
		f.setSize(450, 300);
		ta1.setBackground(new Color(246,255,204));
		p1.setBackground(new Color(255,255,179));
		p1.add(tf);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		f.add(p1, "South");
		f.add(ta1, "Center");
		f.setResizable(false);
		ta1.setEditable(false);
		f.setVisible(true);
		tf.requestFocus();

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
				System.exit(0);
			}
		});
		
		b1.addActionListener(new EventHandler(this,cc3));
		tf.addActionListener(new EventHandler(this,cc3));
		b2.addActionListener(new ButtonHandler(this));
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta1.setText("");
				
			}
		});
	}
}