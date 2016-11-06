package event.mouse.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseTwoListenerTest {

	// 1. GUI 구성
	
	Frame f;
	TextField tf;
	Label la;
	Font font;

	MouseTwoListenerTest() {

		f = new Frame("Two Listener");
		la = new Label("Click and Drag the mouse", Label.CENTER);
		tf = new TextField();
		font = new Font("고딕체", Font.BOLD, 13);
		la.setFont(font);
		la.setForeground(Color.RED);
	}

	public void lunchFrame() {

		f.setSize(400, 300);
		f.add(tf, "South");
		f.add(la, "North");
		f.setVisible(true);


		// 2. Listener 부착
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		f.addMouseListener(new MouseHandler(this));
		f.addMouseMotionListener(new MouseHandler(this));
	}
	
	public static void main(String[] args) {
		MouseTwoListenerTest test = new MouseTwoListenerTest();
		test.lunchFrame();
	}
}