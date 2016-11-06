package event.handler.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * WindowListener를 사용하지 말고
 * WindowAdapter 클래스를 사용해서 창을 닫는 로직을 전개..
 */
class FourButton5 extends WindowAdapter implements ActionListener {
	private Frame f;
	private Panel p;
	private Button b1, b2, b3, b4;
	private TextField tf;

	FourButton5() {
		f = new Frame("Four Button");
		p = new Panel();
		b1 = new Button("나정이");
		b2 = new Button("칠봉이");
		b3 = new Button("쓰레기");
		b4 = new Button("삼천포");
		tf = new TextField(30);
	}

	public void lunchFrame() {
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		f.add(p, "North");
		f.add(tf, "South");
		f.setBackground(Color.pink);
		f.pack();
		f.setVisible(true);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f.addWindowListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			b1.setForeground(Color.RED);
			tf.setText("쓰레기사랑해");
		}
		if (e.getSource() == b2) {
			b2.setForeground(Color.orange);
			tf.setText("끝날때까지 끝난게 아니다");
		}
		if (e.getSource() == b3) {
			b3.setForeground(Color.YELLOW);
			tf.setText("나정이사랑해");
		}
		if (e.getSource() == b4) {
			b4.setForeground(Color.BLUE);
			tf.setText("윤진이사랑해");
		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class FourButtonTest5 {

	public static void main(String[] args) {
		FourButton5 fb5 = new FourButton5();
		fb5.lunchFrame();

	}
}